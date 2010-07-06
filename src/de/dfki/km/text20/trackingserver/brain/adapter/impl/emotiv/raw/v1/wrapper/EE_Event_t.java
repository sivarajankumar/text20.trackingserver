/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 1.3.40
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package de.dfki.km.text20.trackingserver.brain.adapter.impl.emotiv.raw.v1.wrapper;

public final class EE_Event_t {
  public final static EE_Event_t EE_UnknownEvent = new EE_Event_t("EE_UnknownEvent", edkJNI.EE_UnknownEvent_get());
  public final static EE_Event_t EE_EmulatorError = new EE_Event_t("EE_EmulatorError", edkJNI.EE_EmulatorError_get());
  public final static EE_Event_t EE_ReservedEvent = new EE_Event_t("EE_ReservedEvent", edkJNI.EE_ReservedEvent_get());
  public final static EE_Event_t EE_UserAdded = new EE_Event_t("EE_UserAdded", edkJNI.EE_UserAdded_get());
  public final static EE_Event_t EE_UserRemoved = new EE_Event_t("EE_UserRemoved", edkJNI.EE_UserRemoved_get());
  public final static EE_Event_t EE_EmoStateUpdated = new EE_Event_t("EE_EmoStateUpdated", edkJNI.EE_EmoStateUpdated_get());
  public final static EE_Event_t EE_ProfileEvent = new EE_Event_t("EE_ProfileEvent", edkJNI.EE_ProfileEvent_get());
  public final static EE_Event_t EE_CognitivEvent = new EE_Event_t("EE_CognitivEvent", edkJNI.EE_CognitivEvent_get());
  public final static EE_Event_t EE_ExpressivEvent = new EE_Event_t("EE_ExpressivEvent", edkJNI.EE_ExpressivEvent_get());
  public final static EE_Event_t EE_InternalStateChanged = new EE_Event_t("EE_InternalStateChanged", edkJNI.EE_InternalStateChanged_get());
  public final static EE_Event_t EE_AllEvent = new EE_Event_t("EE_AllEvent", edkJNI.EE_AllEvent_get());

  public final int swigValue() {
    return swigValue;
  }

  @Override
  public String toString() {
    return swigName;
  }

  public static EE_Event_t swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + EE_Event_t.class + " with value " + swigValue);
  }

  private EE_Event_t(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private EE_Event_t(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private EE_Event_t(String swigName, EE_Event_t swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static EE_Event_t[] swigValues = { EE_UnknownEvent, EE_EmulatorError, EE_ReservedEvent, EE_UserAdded, EE_UserRemoved, EE_EmoStateUpdated, EE_ProfileEvent, EE_CognitivEvent, EE_ExpressivEvent, EE_InternalStateChanged, EE_AllEvent };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

