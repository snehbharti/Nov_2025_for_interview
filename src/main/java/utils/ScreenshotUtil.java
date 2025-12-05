package utils;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    // Capture a screenshot and save it to the specified location
    public static void captureScreenshot(WebDriver driver, String screenshotDirectory) {
        // Generate a unique name for each screenshot
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String screenshotName = "screenshot_" + timestamp + ".png";
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        
        try {
            FileUtils.copyFile(screenshot, new File(screenshotDirectory + screenshotName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
