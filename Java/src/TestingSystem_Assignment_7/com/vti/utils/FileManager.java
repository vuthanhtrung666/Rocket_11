package TestingSystem_Assignment_7.com.vti.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class FileManager {
	public static final String FILE_EXISTS = "File is exits!";
	public static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
	public static final String FOLDER_EXISTS = "Folder is exits!";
	public static final String FOLDER_NOT_EXISTS = "Folder is not exits!";
	public static final String PATH_NOT_FOLDER = "Error! Path is not folder.";

	public static final String SOURCE_FILE_NOT_EXISTS = "Source File is not exits!";
	public static final String DESTINATION_FILE_EXISTS = "Destination File is exits!";

	public static final String NEW_FILE_EXISTS = "Error! New File Exist.";
	public static final String CREATE_FILE_SUCCESS = "Create file success!";
	public static final String CREATE_FILE_FAIL = "Create file fail!";
	public static final String DELETE_FILE_SUCCESS = "Delete file success!";
	public static final String DELETE_FILE_FAIL = "Delete file fail!";
	
	public static boolean isFileExists(String pathFile) {
		return new File(pathFile).exists() ? true : false;

	}

	public static void isFileExists1(String path) throws Exception {
		boolean isExists = new File(path).exists();
		if(isExists) {
			throw new Exception(FILE_EXISTS);
		} else {
			throw new Exception(FILE_NOT_EXISTS);
		}
	}

	public static void isFolderExists(String path) throws Exception {
		File file = new File(path);
		if (file.exists()) {
			boolean isFolder = new File(path).isDirectory();
			if(isFolder) {
				throw new Exception(FOLDER_EXISTS);
			} else {
				throw new Exception(FOLDER_NOT_EXISTS);
			}
		} else {
			throw new Exception(FILE_NOT_EXISTS);
		}
	}

	public static void createNewFile(String path) throws Exception {
		File file = new File(path);
		if (isFileExists(path)) {
			throw new Exception(FILE_EXISTS);
		} else {
			System.out.println(file.createNewFile() ? CREATE_FILE_SUCCESS : CREATE_FILE_FAIL);
		}
	}

	public static void createNewFile(String path, String fileName) throws Exception {
		String pathFile = path + "//" + fileName;
		createNewFile(pathFile);
	}

	public static void deleteFile(String pathFile) throws Exception {
		File file = new File(pathFile);
		if (isFileExists(pathFile)) {
			System.out.println(file.delete() ? DELETE_FILE_SUCCESS : DELETE_FILE_FAIL);
		} else {
			System.out.println(FILE_NOT_EXISTS);
		}
	}

	public static boolean isFolder(String path) {
		return new File(path).isDirectory() ? true : false;
	}

	public static List<String> getAllFileName(String path) throws Exception {
		File file = new File(path);
		if (!isFolder(path)) {
			throw new Exception(PATH_NOT_FOLDER);
		}
		return Arrays.asList(file.list());
	}

	public static void copyFile(String sourceFile, String destinationPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}
		String[] s = sourceFile.split("/");
		String nameFile = s[s.length - 1];
		String destinationFile = destinationPath + "//" + nameFile;
		if (isFileExists(destinationFile)) {
			throw new Exception(DESTINATION_FILE_EXISTS);
		}
		File source = new File(sourceFile);
		File dest = new File(destinationPath);
		Files.copy(source.toPath(), dest.toPath());
	}

	public static void copyFile(String sourceFile, String destinationPath, String newName) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}
		String destinationFile = destinationPath + "//" + newName;
		if (isFileExists(destinationFile)) {
			throw new Exception(DESTINATION_FILE_EXISTS);
		}
		File source = new File(sourceFile);
		File dest = new File(destinationPath);
		Files.copy(source.toPath(), dest.toPath());
	}
	
	public static void moveFile(String sourceFile, String destinationPath) throws Exception {
		if (!isFileExists(sourceFile)) {
			throw new Exception(SOURCE_FILE_NOT_EXISTS);
		}
		File source = new File(sourceFile);
		File dest = new File(destinationPath);
		Files.move(source.toPath(), dest.toPath());
	}
	
	public static void renameFile(String pathFile, String newName) throws Exception {
		if (!isFileExists(pathFile)) {
			throw new Exception(FILE_NOT_EXISTS);
		}
		if (isFileExists(newName)) {
			throw new Exception(NEW_FILE_EXISTS);
		}
		File oldFile = new File(pathFile);
		File newFile = new File(newName);
		oldFile.renameTo(newFile);
	}
	public static void createNewFolder(String newPathFolder) throws Exception {
		if (isFolder(newPathFolder)) {
			throw new Exception(FOLDER_EXISTS);
		}
		new File(newPathFolder).mkdir();
	}
	
	public static void downloadFile(String fileLink, String folder) throws Exception {
		File file = new File(folder);
		if(isFolder(folder)) {
			System.out.println(FOLDER_NOT_EXISTS);
		}
		String[] s = fileLink.split("/");
		String name = s[s.length - 1];
		folder = folder + "//" + name;
		URL url = new URL(fileLink);
		URLConnection connection = url.openConnection();
		int size = connection.getContentLength();
		InputStream inputStream = connection.getInputStream();
		FileOutputStream output = new FileOutputStream(folder);
		int byteDownload = 0;
		byte[] b = new byte[1024];
		int length = inputStream.read(b);
		while (length != -1) {
			byteDownload += length;
			System.out.println(byteDownload * 100f / size + "%");
			output.write(b, 0, length);
			length = inputStream.read(b);
		}
		output.close();
		inputStream.close();
		System.out.println("Download success");
	}
}
