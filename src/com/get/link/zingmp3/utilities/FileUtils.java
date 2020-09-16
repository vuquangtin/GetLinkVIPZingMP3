package com.get.link.zingmp3.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import ccom.get.link.zingmp3.models.LineInfor;

public class FileUtils {
	static Logger logger = Logger.getLogger(FileUtils.class.getName());
	public static final String NAME_FILE = "pg";
	public static final String ENTER_ROW = "\t\t\t";
	// kich thuoc theo MB
	public static final int FILE_SIZE_MAX_MB = 25;
	public static final int FILE_SIZE_MIN_MB = 5;
	public static String FOLDER_SAVE = null;
	public static String FILE_NAME = null;
	public static String FILE_NAME_NEW = null;

	public static long folderSize(String directory) {
		return folderSize(new File(directory));
	}

	public static long folderSize(File directory) {
		long length = 0;
		if (directory.listFiles() != null) {
			for (File file : directory.listFiles()) {
				if (file.isFile())
					length += file.length();
				else
					length += folderSize(file);
			}
		}
		return length;
	}

	public static String readableFileSize(long size) {
		if (size <= 0)
			return "0";
		final String[] units = new String[] { "B", "kB", "MB", "GB", "TB" };
		int digitGroups = (int) (Math.log10(size) / Math.log10(1024));
		return new DecimalFormat("#,##0.#").format(size
				/ Math.pow(1024, digitGroups))
				+ " " + units[digitGroups];
	}

	public static boolean checkFileIsMaxSize(String fileName) {
		return checkFileIsMaxSize(new File(fileName), FILE_SIZE_MAX_MB);
	}

	public static boolean checkFileIsMaxSize(File file, int Max) {

		// Get length of file in bytes
		long fileSizeInBytes = file.length();
		// Convert the bytes to Kilobytes (1 KB = 1024 Bytes)
		long fileSizeInKB = fileSizeInBytes / 1024;
		// Convert the KB to MegaBytes (1 MB = 1024 KBytes)
		long fileSizeInMB = fileSizeInKB / 1024;

		if (fileSizeInMB > Max) {
			return true;
		}
		return false;
	}

	private static boolean isFile(String path) {
		File file = new File(path);
		if (file.isFile()) {
			return true;
		}
		return false;
	}

	public static String getContent(File[] listFiles) {
		StringBuilder content = new StringBuilder();
		boolean isFirst = true;
		for (File file : listFiles) {

			BufferedReader in;
			try {
				in = new BufferedReader(new FileReader(file.getPath()));
				String line;
				while ((line = in.readLine()) != null) {
					if (!isFirst)
						content.append(SymbolsKeyboard.NEW_LINE_SEPARATOR
								+ line);
					else {
						content.append(line);
						isFirst = false;
					}

				}
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return content.toString();
	}

	public static List<LineInfor> getListLineInfor(String nameFile) {
		List<String> list = getListUrl(nameFile);
		List<LineInfor> listLine = new ArrayList<LineInfor>();
		list.forEach(item -> {
			listLine.add(new LineInfor(item));
		});
		return listLine;
	}

	public static List<String> getListUrl(String nameFile) {
		List<String> list = new ArrayList<String>();
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(nameFile));
			String line;
			while ((line = in.readLine()) != null) {

				try {
					if (line.startsWith("#")) {
						logger.info(line + " break");
						continue;
					}
					if (line.isEmpty() || line.equals("") || line == "") {
						logger.info(line + " isEmpty");
						continue;
					}
					// String[] split = line.split("\t");
					list.add(line);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

	public static void writeUsingFileOutputStream(String nameFile,
			String fileContent) throws IOException {
		FileOutputStream outputStream = new FileOutputStream(nameFile);
		byte[] strToBytes = fileContent.getBytes();
		outputStream.write(strToBytes);
		outputStream.close();
	}

	public static void writeUsingFileWriter(String nameFile, String fileContent)
			throws IOException {
		FileWriter fileWriter = new FileWriter(nameFile, true);
		fileWriter.write(fileContent);
		fileWriter.write("\n");
		fileWriter.close();
	}

	public static Set<String> loadLotusProfile(String nameFile) {
		Set<String> set = new HashSet<String>();
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(nameFile));
			String line;
			while ((line = in.readLine()) != null) {
				try {
					// String[] split = line.split("\t");
					set.add(line);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return set;
	}

	public static String loadLotusProfile(String nameFile, int indexLine) {
		BufferedReader in;
		try {
			in = new BufferedReader(new FileReader(nameFile));
			String line;
			int index = 1;
			while ((line = in.readLine()) != null) {
				try {
					if (indexLine == index) {
						return line;
					}
					index++;
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
