package com.soagrowers.android.tripcomputer.notifications.actions;

import com.soagrowers.android.tripcomputer.R;
import com.soagrowers.android.tripcomputer.data.Constants;

/**
 * Created by Ben on 12/09/2014.
 */
public class WearableStopAction extends AbstractNotificationAction {

  public static final int INTENT_ICON = R.drawable.ic_stat_stop;
  public static final int INTENT_TITLE = R.string.label_notification_button_stop;
  public static final String INTENT_ACTION = Constants.WEAR_NOTIFICATION_STOP_ACTION;

  public WearableStopAction() {
    super(INTENT_ICON, INTENT_TITLE, INTENT_ACTION);
  }
}
