USE adventureworks;
-- Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name của ProductSubcategory là 'Saddles'.
WITH		Name_Saddles AS (
		SELECT		productsubcategory.ProductSubcategoryID
		FROM		productsubcategory
		WHERE		productsubcategory.Name = 'Saddles')
SELECT		p.Name
FROM		product p 
JOIN		productsubcategory ps ON p.ProductSubcategoryID = ps.ProductSubcategoryID
WHERE		ps.ProductSubcategoryID = (
		SELECT		*
		FROM		Name_Saddles);
-- Question 2: Thay đổi câu Query 1 để lấy được kết quả sau.
WITH		Name_Saddles1 AS (
		SELECT		productsubcategory.ProductSubcategoryID
		FROM		productsubcategory
		WHERE		productsubcategory.Name LIKE 'Bo%')
SELECT		p.Name
FROM		product p 
JOIN		productsubcategory ps ON p.ProductSubcategoryID = ps.ProductSubcategoryID
WHERE		ps.ProductSubcategoryID IN (
		SELECT		ProductSubcategoryID
		FROM		Name_Saddles1);
-- Question 3:Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring Bike (nghĩa là ProductSubcategoryID = 3)
-- Hướng dẫn: sử dụng hàm MIN() trong subquery để trả về ListPrice thấp nhất
WITH	
Subid AS (
		SELECT  productsubcategory.ProductSubcategoryID
        FROM 	productsubcategory
        WHERE	productsubcategory.Name LIKE '%Touring Bike%'),
Lowest_ListPrice AS (
		SELECT	MIN(product.ListPrice)
		FROM	product
		WHERE	product.ProductSubcategoryID IN (
			SELECT 	ProductSubcategoryID
            FROM	Subid))
SELECT	p.ProductID,
		p.Name
FROM 	product p
WHERE	p.ListPrice = (
		SELECT	*
		FROM	Lowest_ListPrice);
        
-- Exercise 2: JOIN nhiều bảng
-- Question 1: Viết query lấy danh sách tên country và province được lưu trong AdventureWorks2008sample database.
SELECT		c.Name, s.Name
FROM 		countryregion c
JOIN		stateprovince s ON c.CountryRegionCode = s.CountryRegionCode;
-- Question 2: Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada
-- Chú ý: sủ dụng sort order và column headings
SELECT		c.Name, s.Name
FROM 		countryregion c
JOIN		stateprovince s ON c.CountryRegionCode = s.CountryRegionCode
WHERE		c.Name LIKE 'Germany' OR c.Name LIKE 'Canada' ;
-- Question 3: SalesOrderID, OrderDate and SalesPersonID. Từ bảng SalesPerson, chúng ta lấy cột BusinessEntityID (là định danh của người sales)
-- , Bonus and the SalesYTD (là đã sale được bao nhiêu người trong năm nay)
-- Hướng dẫn: Join SalesOrderHeader và SalesPerson để hạn chế kết quả non-Internet
-- orders (order được xử lý trên Internet có OnlineOrderFlag = 1 và cột SalesPersonID = null)
-- Vì không đủ chỗ nên đã lược cột OrderDate
-- Học sinh khi làm bài cần phải thêm cột OrderDate vào bài làm
SELECT		soh.SalesOrderID,
			soh.OrderDate, 
            sp.SalesPersonID,
            sp.SalesPersonID AS BusinessEntityID,
            sp.Bonus,
            soh.OnlineOrderFlag,
            sp.SalesYTD
FROM		salesperson sp
JOIN		salesorderheader soh ON sp.SalesPersonID = soh.SalesPersonID;
-- Question 4:
-- Sử dụng câu query, thêm cột JobTitle and xóa cột SalesPersonID và BusinessEntityID.
-- Hướng dẫn: Join với bảng HumanResources.Employee
SELECT		soh.SalesOrderID,
			soh.OrderDate, 
            e.Title AS Jobtitle,
            sp.Bonus,
            sp.SalesYTD
FROM		salesperson sp
JOIN		salesorderheader soh ON sp.SalesPersonID = soh.SalesPersonID
JOIN		employee e ON e.EmployeeID = sp.SalesPersonID;