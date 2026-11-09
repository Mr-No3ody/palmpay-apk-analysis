package androidx.constraintlayout.core.motion.utils;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.common.base.Ascii;
import com.google.logging.type.LogSeverity;
import com.transsnet.palmpay.core.bean.message.MessageEvent;

/* JADX INFO: loaded from: classes.dex */
public interface TypedValues {

    public interface AttributesType {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        static int getId(String str) {
            byte b7;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    b7 = !str.equals("easing") ? (byte) -1 : (byte) 0;
                    break;
                case -1249320806:
                    b7 = !str.equals("rotationX") ? (byte) -1 : (byte) 1;
                    break;
                case -1249320805:
                    b7 = !str.equals("rotationY") ? (byte) -1 : (byte) 2;
                    break;
                case -1249320804:
                    b7 = !str.equals("rotationZ") ? (byte) -1 : (byte) 3;
                    break;
                case -1225497657:
                    b7 = !str.equals("translationX") ? (byte) -1 : (byte) 4;
                    break;
                case -1225497656:
                    b7 = !str.equals("translationY") ? (byte) -1 : (byte) 5;
                    break;
                case -1225497655:
                    b7 = !str.equals("translationZ") ? (byte) -1 : (byte) 6;
                    break;
                case -1001078227:
                    b7 = !str.equals(ReactProgressBarViewManager.PROP_PROGRESS) ? (byte) -1 : (byte) 7;
                    break;
                case -987906986:
                    b7 = !str.equals("pivotX") ? (byte) -1 : (byte) 8;
                    break;
                case -987906985:
                    b7 = !str.equals("pivotY") ? (byte) -1 : (byte) 9;
                    break;
                case -908189618:
                    b7 = !str.equals(ViewProps.SCALE_X) ? (byte) -1 : (byte) 10;
                    break;
                case -908189617:
                    b7 = !str.equals(ViewProps.SCALE_Y) ? (byte) -1 : Ascii.VT;
                    break;
                case -880905839:
                    b7 = !str.equals("target") ? (byte) -1 : Ascii.FF;
                    break;
                case -4379043:
                    b7 = !str.equals(ViewProps.ELEVATION) ? (byte) -1 : Ascii.CR;
                    break;
                case 92909918:
                    b7 = !str.equals("alpha") ? (byte) -1 : Ascii.SO;
                    break;
                case 97692013:
                    b7 = !str.equals("frame") ? (byte) -1 : Ascii.SI;
                    break;
                case 579057826:
                    b7 = !str.equals("curveFit") ? (byte) -1 : Ascii.DLE;
                    break;
                case 803192288:
                    b7 = !str.equals("pathRotate") ? (byte) -1 : (byte) 17;
                    break;
                case 1167159411:
                    b7 = !str.equals("pivotTarget") ? (byte) -1 : Ascii.DC2;
                    break;
                case 1941332754:
                    b7 = !str.equals("visibility") ? (byte) -1 : (byte) 19;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    return 317;
                case 1:
                    return MessageEvent.EVENT_LOG_IN_SUCCESS;
                case 2:
                    return MessageEvent.EVENT_COUNTRY_CHANGED;
                case 3:
                    return MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE;
                case 7:
                    return 315;
                case 8:
                    return 313;
                case 9:
                    return 314;
                case 10:
                    return MessageEvent.EVENT_GRAB_PAY_SUCCESS;
                case 11:
                    return MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH;
                case 12:
                    return 101;
                case 13:
                    return MessageEvent.EVENT_SIGN_UP_SUCCESS;
                case 14:
                    return 303;
                case 15:
                    return 100;
                case 16:
                    return 301;
                case 17:
                    return 316;
                case 18:
                    return 318;
                case 19:
                    return 302;
                default:
                    return -1;
            }
        }

        static int getType(int i7) {
            if (i7 == 100) {
                return 2;
            }
            if (i7 == 101) {
                return 8;
            }
            switch (i7) {
                case 301:
                case 302:
                    return 2;
                case 303:
                case 304:
                case 305:
                case MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE /* 306 */:
                case MessageEvent.EVENT_SIGN_UP_SUCCESS /* 307 */:
                case MessageEvent.EVENT_LOG_IN_SUCCESS /* 308 */:
                case MessageEvent.EVENT_COUNTRY_CHANGED /* 309 */:
                case MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS /* 310 */:
                case MessageEvent.EVENT_GRAB_PAY_SUCCESS /* 311 */:
                case MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH /* 312 */:
                case 313:
                case 314:
                case 315:
                case 316:
                    return 4;
                case 317:
                case 318:
                    return 8;
                default:
                    return -1;
            }
        }
    }

    public interface Custom {
        static int getId(String str) {
            str.getClass();
            switch (str) {
                case "dimension":
                    return 905;
                case "string":
                    return 903;
                case "refrence":
                    return 906;
                case "boolean":
                    return 904;
                case "color":
                    return 902;
                case "float":
                    return 901;
                case "integer":
                    return 900;
                default:
                    return -1;
            }
        }
    }

    public interface CycleType {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        static int getId(String str) {
            byte b7;
            str.getClass();
            switch (str.hashCode()) {
                case -1310311125:
                    b7 = !str.equals("easing") ? (byte) -1 : (byte) 0;
                    break;
                case -1249320806:
                    b7 = !str.equals("rotationX") ? (byte) -1 : (byte) 1;
                    break;
                case -1249320805:
                    b7 = !str.equals("rotationY") ? (byte) -1 : (byte) 2;
                    break;
                case -1249320804:
                    b7 = !str.equals("rotationZ") ? (byte) -1 : (byte) 3;
                    break;
                case -1225497657:
                    b7 = !str.equals("translationX") ? (byte) -1 : (byte) 4;
                    break;
                case -1225497656:
                    b7 = !str.equals("translationY") ? (byte) -1 : (byte) 5;
                    break;
                case -1225497655:
                    b7 = !str.equals("translationZ") ? (byte) -1 : (byte) 6;
                    break;
                case -1001078227:
                    b7 = !str.equals(ReactProgressBarViewManager.PROP_PROGRESS) ? (byte) -1 : (byte) 7;
                    break;
                case -987906986:
                    b7 = !str.equals("pivotX") ? (byte) -1 : (byte) 8;
                    break;
                case -987906985:
                    b7 = !str.equals("pivotY") ? (byte) -1 : (byte) 9;
                    break;
                case -908189618:
                    b7 = !str.equals(ViewProps.SCALE_X) ? (byte) -1 : (byte) 10;
                    break;
                case -908189617:
                    b7 = !str.equals(ViewProps.SCALE_Y) ? (byte) -1 : Ascii.VT;
                    break;
                case 92909918:
                    b7 = !str.equals("alpha") ? (byte) -1 : Ascii.FF;
                    break;
                case 579057826:
                    b7 = !str.equals("curveFit") ? (byte) -1 : Ascii.CR;
                    break;
                case 803192288:
                    b7 = !str.equals("pathRotate") ? (byte) -1 : Ascii.SO;
                    break;
                case 1941332754:
                    b7 = !str.equals("visibility") ? (byte) -1 : Ascii.SI;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    return 420;
                case 1:
                    return MessageEvent.EVENT_LOG_IN_SUCCESS;
                case 2:
                    return MessageEvent.EVENT_COUNTRY_CHANGED;
                case 3:
                    return MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS;
                case 4:
                    return 304;
                case 5:
                    return 305;
                case 6:
                    return MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE;
                case 7:
                    return 315;
                case 8:
                    return 313;
                case 9:
                    return 314;
                case 10:
                    return MessageEvent.EVENT_GRAB_PAY_SUCCESS;
                case 11:
                    return MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH;
                case 12:
                    return MessageEvent.EVENT_BILL_SUCCESS;
                case 13:
                    return MessageEvent.EVENT_OC_EXIT_APPLY;
                case 14:
                    return 416;
                case 15:
                    return 402;
                default:
                    return -1;
            }
        }

        static int getType(int i7) {
            if (i7 == 100) {
                return 2;
            }
            if (i7 == 101) {
                return 8;
            }
            if (i7 == 416) {
                return 4;
            }
            if (i7 == 420 || i7 == 421) {
                return 8;
            }
            switch (i7) {
                case 304:
                case 305:
                case MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE /* 306 */:
                case MessageEvent.EVENT_SIGN_UP_SUCCESS /* 307 */:
                case MessageEvent.EVENT_LOG_IN_SUCCESS /* 308 */:
                case MessageEvent.EVENT_COUNTRY_CHANGED /* 309 */:
                case MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS /* 310 */:
                case MessageEvent.EVENT_GRAB_PAY_SUCCESS /* 311 */:
                case MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH /* 312 */:
                case 313:
                case 314:
                case 315:
                    return 4;
                default:
                    switch (i7) {
                        case MessageEvent.EVENT_OC_EXIT_APPLY /* 401 */:
                        case 402:
                            return 2;
                        case MessageEvent.EVENT_BILL_SUCCESS /* 403 */:
                            return 4;
                        default:
                            switch (i7) {
                                case 423:
                                case 424:
                                case 425:
                                    return 4;
                                default:
                                    return -1;
                            }
                    }
            }
        }
    }

    public interface MotionScene {
        static int getId(String str) {
            str.getClass();
            if (str.equals("defaultDuration")) {
                return LogSeverity.CRITICAL_VALUE;
            }
            return !str.equals("layoutDuringTransition") ? -1 : 601;
        }

        static int getType(int i7) {
            if (i7 != 600) {
                return i7 != 601 ? -1 : 1;
            }
            return 2;
        }
    }

    public interface MotionType {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        static int getId(String str) {
            byte b7;
            str.getClass();
            switch (str.hashCode()) {
                case -2033446275:
                    b7 = !str.equals("AnimateCircleAngleTo") ? (byte) -1 : (byte) 0;
                    break;
                case -1532277420:
                    b7 = !str.equals("QuantizeMotionPhase") ? (byte) -1 : (byte) 1;
                    break;
                case -1529145600:
                    b7 = !str.equals("QuantizeMotionSteps") ? (byte) -1 : (byte) 2;
                    break;
                case -1498310144:
                    b7 = !str.equals("PathRotate") ? (byte) -1 : (byte) 3;
                    break;
                case -1030753096:
                    b7 = !str.equals("QuantizeInterpolator") ? (byte) -1 : (byte) 4;
                    break;
                case -762370135:
                    b7 = !str.equals("DrawPath") ? (byte) -1 : (byte) 5;
                    break;
                case -232872051:
                    b7 = !str.equals("Stagger") ? (byte) -1 : (byte) 6;
                    break;
                case 1138491429:
                    b7 = !str.equals("PolarRelativeTo") ? (byte) -1 : (byte) 7;
                    break;
                case 1539234834:
                    b7 = !str.equals("QuantizeInterpolatorType") ? (byte) -1 : (byte) 8;
                    break;
                case 1583722451:
                    b7 = !str.equals("QuantizeInterpolatorID") ? (byte) -1 : (byte) 9;
                    break;
                case 1639368448:
                    b7 = !str.equals("TransitionEasing") ? (byte) -1 : (byte) 10;
                    break;
                case 1900899336:
                    b7 = !str.equals("AnimateRelativeTo") ? (byte) -1 : Ascii.VT;
                    break;
                case 2109694967:
                    b7 = !str.equals("PathMotionArc") ? (byte) -1 : Ascii.FF;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    return 606;
                case 1:
                    return 602;
                case 2:
                    return 610;
                case 3:
                    return 601;
                case 4:
                    return 604;
                case 5:
                    return 608;
                case 6:
                    return LogSeverity.CRITICAL_VALUE;
                case 7:
                    return 609;
                case 8:
                    return 611;
                case 9:
                    return 612;
                case 10:
                    return 603;
                case 11:
                    return 605;
                case 12:
                    return 607;
                default:
                    return -1;
            }
        }
    }

    public interface OnSwipe {
    }

    public interface PositionType {
        static int getId(String str) {
            str.getClass();
            switch (str) {
                case "transitionEasing":
                    return 501;
                case "percentWidth":
                    return 503;
                case "percentHeight":
                    return 504;
                case "drawPath":
                    return 502;
                case "sizePercent":
                    return 505;
                case "percentX":
                    return 506;
                case "percentY":
                    return 507;
                default:
                    return -1;
            }
        }

        static int getType(int i7) {
            if (i7 == 100) {
                return 2;
            }
            if (i7 == 101) {
                return 8;
            }
            switch (i7) {
                case 501:
                case 502:
                    return 8;
                case 503:
                case 504:
                case 505:
                case 506:
                case 507:
                    return 4;
                case 508:
                    return 2;
                default:
                    return -1;
            }
        }
    }

    public interface TransitionType {
        static int getId(String str) {
            str.getClass();
            switch (str) {
                case "transitionFlags":
                    return 707;
                case "duration":
                    return 700;
                case "motionInterpolator":
                    return 705;
                case "autoTransition":
                    return 704;
                case "to":
                    return 702;
                case "from":
                    return 701;
                case "pathMotionArc":
                    return 509;
                case "staggered":
                    return 706;
                default:
                    return -1;
            }
        }

        static int getType(int i7) {
            if (i7 == 509) {
                return 2;
            }
            switch (i7) {
                case 700:
                    return 2;
                case 701:
                case 702:
                    return 8;
                default:
                    switch (i7) {
                        case 705:
                        case 707:
                            return 8;
                        case 706:
                            return 4;
                        default:
                            return -1;
                    }
            }
        }
    }

    public interface TriggerType {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        static int getId(String str) {
            byte b7;
            str.getClass();
            switch (str.hashCode()) {
                case -1594793529:
                    b7 = !str.equals("positiveCross") ? (byte) -1 : (byte) 0;
                    break;
                case -966421266:
                    b7 = !str.equals("viewTransitionOnPositiveCross") ? (byte) -1 : (byte) 1;
                    break;
                case -786670827:
                    b7 = !str.equals("triggerCollisionId") ? (byte) -1 : (byte) 2;
                    break;
                case -648752941:
                    b7 = !str.equals("triggerID") ? (byte) -1 : (byte) 3;
                    break;
                case -638126837:
                    b7 = !str.equals("negativeCross") ? (byte) -1 : (byte) 4;
                    break;
                case -76025313:
                    b7 = !str.equals("triggerCollisionView") ? (byte) -1 : (byte) 5;
                    break;
                case -9754574:
                    b7 = !str.equals("viewTransitionOnNegativeCross") ? (byte) -1 : (byte) 6;
                    break;
                case 64397344:
                    b7 = !str.equals("CROSS") ? (byte) -1 : (byte) 7;
                    break;
                case 364489912:
                    b7 = !str.equals("triggerSlack") ? (byte) -1 : (byte) 8;
                    break;
                case 1301930599:
                    b7 = !str.equals("viewTransitionOnCross") ? (byte) -1 : (byte) 9;
                    break;
                case 1401391082:
                    b7 = !str.equals("postLayout") ? (byte) -1 : (byte) 10;
                    break;
                case 1535404999:
                    b7 = !str.equals("triggerReceiver") ? (byte) -1 : Ascii.VT;
                    break;
                default:
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    return MessageEvent.EVENT_COUNTRY_CHANGED;
                case 1:
                    return 302;
                case 2:
                    return MessageEvent.EVENT_SIGN_UP_SUCCESS;
                case 3:
                    return MessageEvent.EVENT_LOG_IN_SUCCESS;
                case 4:
                    return MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS;
                case 5:
                    return MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE;
                case 6:
                    return 303;
                case 7:
                    return MessageEvent.EVENT_GRAB_COUNT_DOWN_FINISH;
                case 8:
                    return 305;
                case 9:
                    return 301;
                case 10:
                    return 304;
                case 11:
                    return MessageEvent.EVENT_GRAB_PAY_SUCCESS;
                default:
                    return -1;
            }
        }
    }

    int getId(String str);

    boolean setValue(int i7, float f10);

    boolean setValue(int i7, int i10);

    boolean setValue(int i7, String str);

    boolean setValue(int i7, boolean z3);
}
