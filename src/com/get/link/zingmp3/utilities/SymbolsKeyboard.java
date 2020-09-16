package com.get.link.zingmp3.utilities;

/**
 * Lớp chứa các ký tự bạn phím máy tính
 * 
 * @author EMAIL:vuquangtin@gmail.com , tel:01677443333
 * @version 1.0.0
 * @see <a
 *      href="https://github.com/vuquangtin/designpattern">https://github.com/vuquangtin/designpattern</a>
 *
 */
public class SymbolsKeyboard {
	// https://www.computerhope.com/keys.htm
	// https://coolefriend.com/know-names-of-symbols-in-your-computer-keyboard/
	public static final String BACK_QUOTE_SYMBOLS = "`";
	public static final String EMPTY_SYMBOLS = "";
	public static final String ENTER_KEY_SYMBOLS = "\n";
	public static final String TAB_KEY_SYMBOLS = "\t";
	public static final String TAB_KEY_SYMBOLS_REGEX = "\\t";
	public static final String WINDOWS_KEY = "";
	public static final String COMMAND_KEY = "";
	public static final String MENU_KEY = "";
	public static final String CAPS_LOCK_KEY = "";
	public static final String SHIFT_KEY = "";
	public static final String CTRL_KEY = "";
	public static final String SEMI_COLO_KEY = ";";
	public static final String EQUAL_KEY = "=";
	// Delimiter used in CSV file
	public static final String COMMA_DELIMITER = ",";
	public static final String VERTICAL_BAR = "|";
	public static final String VERTICAL_BAR_REGEX = "\\|";
	public static final String NEW_LINE_SEPARATOR = "\n";
	public static final String QUOTES = "\"";

	public static final String UNDERSCORE = "_";
	// public static final String TAB_CHAR = "\t";
	public static final String EMPTY = "";
	public final static char CR = (char) 0x0D;
	public final static char LF = (char) 0x0A;
	public final static String CRLF = "" + CR + LF;
	public final static String SLASH_WINDOWS_KEY = "\\";
	public final static String SLASH_UNIX_KEY = "/";
	public final static String HASH_SIGN = "#";
	public final static String AT_SIGN = "@";
	public static String SLASH_EMPTY_KEY = "";
	/***
	 * Basic Multilingual Plane<br/>
	 * <a href=
	 * "https://en.wikipedia.org/wiki/Plane_(Unicode)#Basic_Multilingual_Plane">
	 * Basic Multilingual Plane </a> <br/>
	 * The first plane, plane 0, the Basic Multilingual Plane (BMP) contains
	 * characters for almost all modern languages, and a large number of
	 * symbols. A primary objective for the BMP is to support the unification of
	 * prior character sets as well as characters for writing. Most of the
	 * assigned code points in the BMP are used to encode Chinese, Japanese, and
	 * Korean (CJK) characters.
	 */
	public static final String BMP_UNICODE_ARRAY = "[^\u0000-\uFFFF]";
}
