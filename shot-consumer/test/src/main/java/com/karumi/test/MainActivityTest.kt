package com.karumi.test

import androidx.test.core.app.ActivityScenario
import com.karumi.shot.ActivityScenarioUtils.waitForActivity
import com.karumi.shot.ScreenshotTest
import com.karumi.ui.view.MainActivity
import org.junit.Test

class MainActivityTest : ScreenshotTest {

    @Test
    fun showMainActivity() {
        val activity = ActivityScenario.launch(MainActivity::class.java)
        compareScreenshot(activity.waitForActivity())
    }
}