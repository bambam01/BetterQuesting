package betterquesting.api.storage;

import java.io.File;

/**
 * A container for all the configurable settings in the mod
 */
public class BQ_Settings
{
	/**
	 * The root directory of the currently loaded world/save
	 */
	public static File curWorldDir = null;
	public static String defaultDir = "config/betterquesting/";
	
	public static boolean useBookmark = true;
	public static String curTheme = "betterquesting:light";
	public static int guiWidth = -1;
	public static int guiHeight = -1;
	public static boolean questNotices = true;
	public static boolean dirtyMode = true;
	public static float scrollMultiplier = 0.1F;

	public static float zoomSpeed = 1.25f;
	public static float zoomTimeInMs = 100f;

	public static boolean zoomInToCursor = true;
	public static boolean zoomOutToCursor = false;
}
