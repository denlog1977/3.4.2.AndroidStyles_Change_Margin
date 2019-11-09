package com.example.a342androidstyles_change_margin;

import android.content.Intent;

public class Utils {

    private static int sTheme;

    public final static int THEME_Margin1 = 1;
    public final static int THEME_Margin3 = 2;
    public final static int THEME_Margin10 = 3;

    /**
     * Set the theme of the Activity, and restart it by creating a new Activity of the same type.
     */
    public static void changeToTheme(MainActivity activity, int theme)
    {
        sTheme = theme;
        activity.finish();

        activity.startActivity(new Intent(activity, activity.getClass()));

    }

    /** Set the theme of the activity, according to the configuration. */
    public static void onActivityCreateSetTheme(MainActivity activity)
    {
        switch (sTheme)
        {
            default:

            case THEME_Margin1:
                activity.setTheme(R.style.Margin1);
                break;
            case THEME_Margin3:
                activity.setTheme(R.style.Margin3);
                break;
            case THEME_Margin10:
                activity.setTheme(R.style.Margin10);
                break;
        }
    }
}