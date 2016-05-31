package com.soagrowers.android.tripcomputer.events;

import com.google.android.gms.location.DetectedActivity;
import com.google.common.base.Optional;

/**
 * Created by Ben on 29/09/2014.
 */
public class AutoStartTrigger extends AbstractEvent {

  private Optional<DetectedActivity> activity;

  public AutoStartTrigger(String eventSource, DetectedActivity activity) {
    super(eventSource);
    this.activity = Optional.of(activity);
  }

  public DetectedActivity getActivity() {
    return activity.get();
  }
}
