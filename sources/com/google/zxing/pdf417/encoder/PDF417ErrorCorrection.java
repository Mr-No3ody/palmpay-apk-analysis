package com.google.zxing.pdf417.encoder;

import com.facebook.imageutils.JfifUtil;
import com.facebook.imageutils.TiffUtil;
import com.google.android.material.internal.ViewUtils;
import com.google.logging.type.LogSeverity;
import com.google.mlkit.common.MlKitException;
import com.google.zxing.WriterException;
import com.google.zxing.pdf417.PDF417Common;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.account.ui.activity.SetUserPhotoActivity;
import com.transsnet.palmpay.aidl.MsgEvent;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.message.MessageEvent;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;

/* JADX INFO: loaded from: classes3.dex */
final class PDF417ErrorCorrection {
    private static final int[][] EC_COEFFICIENTS = {new int[]{27, 917}, new int[]{SetUserPhotoActivity.REQUEST_CODE_TAKE_PHOTO, MessageEvent.EVENT_ROUTER_EXIT, 723, 809}, new int[]{237, MessageEvent.EVENT_LOG_IN_SUCCESS, 436, 284, 646, 653, 428, 379}, new int[]{TiffUtil.TIFF_TAG_ORIENTATION, MessageEvent.EVENT_OC_LOAN_EXPECTATION_COMPLETED, 232, 755, 599, SetUserPhotoActivity.REQUEST_CODE_CAPTURE_FACE, 801, 132, 295, 116, 442, 428, 295, 42, 176, 65}, new int[]{MessageEvent.EVENT_CL_OPEN_SUCCESS, 575, 922, 525, 176, 586, 640, 321, MessageEvent.EVENT_PAYMENT_RETRY, 742, 677, 742, 687, 284, 193, MessageEvent.EVENT_FACE_CAPTURE_RETRIEVED, MessageEvent.EVENT_NOTIFICATION_ARRIVE, 494, 263, 147, MessageEvent.EVENT_REMOTE_CONFIG_DONE, LogSeverity.EMERGENCY_VALUE, 571, 320, 803, 133, 231, MessageEvent.EVENT_AABILL_PAY_COMPLETED, 685, 330, 63, 410}, new int[]{539, 422, 6, 93, 862, 771, 453, 106, 610, 287, 107, 505, 733, 877, 381, 612, 723, 476, 462, 172, 430, 609, 858, 822, 543, MessageEvent.EVENT_VERIFY_PHOTO_SUCCESS, 511, 400, 672, 762, MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET, 184, 440, 35, MessageEvent.EVENT_BALANCE_SECURITY_STATE_CHANGE, 31, 460, MessageEvent.EVENT_AUDIO_CHANGE, JfifUtil.MARKER_APP1, 535, MessageEvent.EVENT_FACE_CAPTURE_RETRIEVED, MessageEvent.EVENT_CORE_COMMENT_SUCCESS, 605, 158, 651, MlKitException.CODE_SCANNER_CANCELLED, 488, 502, 648, 733, 717, 83, MessageEvent.EVENT_BILL_PENDING, 97, 280, 771, 840, 629, 4, 381, 843, 623, 264, 543}, new int[]{MessageEvent.EVENT_PERMISSION_CONTACTS, MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS, 864, MessageEvent.EVENT_KYC_COMPLETED, 858, 580, 296, 379, 53, 779, 897, 444, 400, 925, 749, 415, 822, 93, JfifUtil.MARKER_EOI, JfifUtil.MARKER_RST0, PDF417Common.MAX_CODEWORDS_IN_BARCODE, 244, 583, 620, 246, 148, 447, 631, MessageEvent.EVENT_GET_USSD_PAY_RESULT, 908, 490, 704, MessageEvent.EVENT_CLOSE_SIGN_UP, 258, 457, 907, MessageEvent.EVENT_AUDIO_CHANGE, 723, 674, MessageEvent.EVENT_GET_USSD_PAY_RESULT, 272, 96, 684, 432, 686, 606, 860, MessageEvent.EVENT_LOAN_HOME_CHANGE_MOBILE_INSTALLMENT_TAB, 193, 219, 129, 186, 236, 287, JfifUtil.MARKER_SOFn, 775, 278, 173, 40, 379, 712, 463, 646, 776, 171, 491, 297, 763, 156, 732, 95, 270, 447, 90, 507, 48, 228, 821, 808, 898, 784, 663, 627, 378, 382, 262, 380, 602, 754, MessageEvent.EVENT_GRAB_ADD_ADDRESS_SUCCESS, 89, 614, 87, 432, 670, 616, 157, MessageEvent.EVENT_FINISH_SCHEDULE_GUIDE_PAGE, 242, 726, LogSeverity.CRITICAL_VALUE, 269, MessageEvent.EVENT_BUY_BUNDLE_SUCCESS, 898, 845, 454, MessageEvent.EVENT_BUY_EARLY_REFUND_FINISH_PAY, 130, 814, 587, 804, 34, 211, 330, 539, 297, 827, 865, 37, MessageEvent.EVENT_FACE_CAPTURE_RETRIEVED, 834, 315, MessageEvent.EVENT_SCHEDULE_LIST_REFRESH, 86, 801, 4, 108, 539}, new int[]{SetUserPhotoActivity.REQUEST_CODE_CAPTURE_FACE, 894, 75, 766, 882, 857, 74, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 82, 586, 708, 250, 905, 786, 138, 720, 858, 194, MessageEvent.EVENT_GRAB_PAY_SUCCESS, 913, MessageEvent.EVENT_ADD_NEW_BANK_CARD, 190, MessageEvent.EVENT_BUY_BUNDLE_SUCCESS, 850, 438, 733, 194, 280, MlKitException.CODE_SCANNER_CANCELLED, 280, 828, 757, 710, 814, 919, 89, 68, MessageEvent.EVENT_LOAN_HOME_CHANGE_MOBILE_INSTALLMENT_TAB, 11, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 796, 605, 540, 913, 801, 700, 799, 137, 439, 418, MessageEvent.EVENT_FIXED_SAVING_TAB_CHANGE, 668, MessageEvent.EVENT_CL_TAKE_PHOTO_SUCCESS, 859, MessageEvent.EVENT_CL_LAST_ORDER_ID, 694, 325, 240, JfifUtil.MARKER_SOI, 257, 284, MessageEvent.EVENT_LOAN_SETTLEMENT, 209, 884, 315, 70, MessageEvent.EVENT_OC_REPAY_FAILED, 793, 490, TiffUtil.TIFF_TAG_ORIENTATION, 877, 162, 749, 812, 684, 461, 334, MessageEvent.EVENT_VERIFY_PHOTO_SUCCESS, 849, MessageEvent.EVENT_PERMISSION_CONTACTS, MessageEvent.EVENT_SIGN_UP_SUCCESS, MessageEvent.BIND_PAY_BANK_ACCOUNT_SUCCESS, 803, 712, 19, MessageEvent.EVENT_CL_REPAYMENT_SUCCESS, 399, 908, MsgEvent.MSG_EVENT_STOP_FOREGROUND, 511, 51, 8, MessageEvent.EVENT_FACE_CAPTURE_RETRIEVED, JfifUtil.MARKER_APP1, MessageEvent.EVENT_ADD_NEW_CARD_ERROR, 470, 637, 731, 66, 255, 917, 269, 463, 830, 730, 433, 848, 585, 136, 538, 906, 90, 2, MessageEvent.EVENT_TOP_UP_AIRTIME_SUCCESS, 743, 199, 655, 903, MessageEvent.EVENT_OC_REPAY_FAILED, 49, 802, 580, MessageEvent.EVENT_CL_BORROW_SUCCESS, 588, PictureConfig.CHOOSE_REQUEST, 462, 10, 134, 628, 320, 479, 130, 739, 71, 263, 318, MessageEvent.EVENT_FINISH_SCHEDULE_GUIDE_PAGE, 601, JfifUtil.MARKER_SOFn, 605, 142, 673, 687, 234, 722, MessageEvent.EVENT_GO_TO_PERSON_TRANSFER, 177, 752, 607, 640, 455, 193, 689, 707, 805, 641, 48, 60, 732, 621, 895, MessageEvent.EVENT_DOWNLOAD_COIN_RAIN_SUCCESS, 261, 852, 655, MessageEvent.EVENT_COUNTRY_CHANGED, 697, 755, 756, 60, 231, 773, 434, 421, 726, MessageEvent.EVENT_EMPTY_PALMPAY_RECENTLY, 503, 118, 49, 795, 32, 144, 500, 238, 836, 394, 280, MessageEvent.EVENT_OC_BIND_CARD_EXIT, 319, 9, 647, MessageEvent.EVENT_SCHEDULE_LIST_REFRESH, 73, 914, 342, 126, 32, 681, 331, 792, 620, 60, 609, 441, 180, 791, 893, 754, 605, 383, 228, 749, 760, 213, 54, 297, 134, 54, 834, 299, 922, 191, 910, MessageEvent.EVENT_GENIEX_RECHARGE_BALANCE_SUCCESS, 609, 829, 189, 20, 167, 29, 872, 449, 83, 402, 41, 656, 505, 579, 481, 173, MessageEvent.EVENT_BILL_PENDING, 251, 688, 95, 497, 555, 642, 543, MessageEvent.EVENT_SIGN_UP_SUCCESS, 159, 924, 558, 648, 55, 497, 10}, new int[]{MessageEvent.EVENT_CORE_COMMENT_SUCCESS, 77, MessageEvent.EVENT_FINISH_SCHEDULE_MANAGE_PAGE, 504, 35, 599, 428, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, MessageEvent.EVENT_OPEN_CASHBOX_AUTO_TRANSFER, 574, 118, 498, 285, 380, 350, 492, 197, 265, 920, 155, 914, 299, 229, 643, 294, 871, MessageEvent.EVENT_FINISH_QUTELLER_PAY_PREVIEW_PAGE, 88, 87, 193, MessageEvent.EVENT_CORE_COMMENT_SUCCESS, 781, 846, 75, MessageEvent.EVENT_OC_REPAY_SUCCESS, MessageEvent.EVENT_TO_LOAD_DRAFT, 435, 543, MlKitException.CODE_SCANNER_APP_NAME_UNAVAILABLE, 666, 249, 346, 781, 621, 640, 268, 794, 534, 539, 781, MessageEvent.EVENT_SYNC_CONTACTS, MessageEvent.EVENT_AABILL_PAY_COMPLETED, 644, 102, 476, 499, MessageEvent.EVENT_TOP_UP_AIRTIME_SUCCESS, 632, MessageEvent.EVENT_REPORT_TASK_COMPLETED, 37, 858, 916, MessageEvent.EVENT_OC_RN_LOAN_ROUTE, 41, 542, MessageEvent.EVENT_ADD_NEW_CARD_ERROR, 122, 272, 383, LogSeverity.EMERGENCY_VALUE, 485, 98, 752, 472, 761, 107, 784, 860, 658, 741, MessageEvent.EVENT_TOP_UP_AIRTIME_SUCCESS, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS, 681, 407, 855, 85, 99, 62, 482, 180, 20, 297, 451, MessageEvent.EVENT_REMOTE_CONFIG_DONE, 913, 142, 808, 684, 287, MessageEvent.EVENT_PAYMENT_RETRY, MessageEvent.EVENT_OC_BANK_VERIFY_COMPLETED, 76, 653, 899, 729, MessageEvent.EVENT_OC_OPAY_REVERSE_COMPLETED, 744, MessageEvent.EVENT_AABILL_PAY_COMPLETED, MessageEvent.EVENT_USER_AGENT_UPDATE, JfifUtil.MARKER_SOFn, MessageEvent.EVENT_CLOSE_SIGN_UP, 258, 240, MessageEvent.EVENT_SEND_EVENT_BACK_TO_RN_PAGE, 794, 395, ViewUtils.EDGE_TO_EDGE_FLAGS, 848, 51, 610, MessageEvent.EVENT_GO_TO_PERSON_TRANSFER, 168, 190, 826, MessageEvent.EVENT_OC_REPAY_PENDING, 596, 786, 303, 570, 381, 415, 641, 156, 237, 151, 429, MessageEvent.EVENT_GENIEX_BUY_BUNDLE_SUCCESS, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 676, 710, 89, 168, 304, 402, 40, 708, 575, 162, 864, 229, 65, 861, 841, 512, 164, 477, 221, 92, MessageEvent.EVENT_CL_REPAYMENT_SUCCESS, 785, 288, MessageEvent.EVENT_CL_BORROW_FAILED, 850, 836, 827, 736, 707, 94, 8, 494, 114, MessageEvent.EVENT_PERMISSION_CONTACTS, 2, 499, 851, 543, 152, 729, 771, 95, 248, MessageEvent.EVENT_CL_OPEN_SUCCESS, 578, 323, 856, 797, MessageEvent.EVENT_ADD_NEW_CARD_ERROR, 51, 684, 466, 533, 820, 669, 45, 902, 452, 167, 342, 244, 173, 35, 463, 651, 51, 699, 591, 452, 578, 37, 124, 298, 332, MessageEvent.EVENT_OC_RN_LOAN_ROUTE, 43, 427, 119, 662, 777, 475, 850, 764, 364, 578, 911, MessageEvent.EVENT_ADD_NEW_MOBILE_WALLET, 711, 472, 420, 245, 288, MessageEvent.EVENT_AUDIO_CHANGE, 394, 511, MessageEvent.EVENT_OC_REPAY_SUCCESS, 589, 777, 699, 688, 43, MessageEvent.EVENT_SYNC_CONTACTS, 842, 383, 721, MessageEvent.EVENT_PERMISSION_CONTACTS, MessageEvent.EVENT_ROUTER_NEXT, 644, 714, 559, 62, 145, 873, 663, 713, 159, 672, 729, 624, 59, 193, 417, 158, 209, MessageEvent.EVENT_OC_REFRESH_LOAN_HOME_DATA, MessageEvent.EVENT_OC_BANK_AUTH_COMPLETED, MessageEvent.EVENT_PAY_ORDER_FINISH, 693, 109, 608, MessageEvent.EVENT_OC_REFRESH_LOAN_HOME_DATA, 365, 181, 772, 677, MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS, 248, MessageEvent.EVENT_CL_TAKE_PHOTO_SUCCESS, 708, 410, 579, 870, 617, 841, 632, 860, MessageEvent.EVENT_ADD_NEW_CARD_ERROR, MessageEvent.EVENT_PAYMENT_RETRY, 35, 777, 618, 586, 424, 833, 77, 597, 346, 269, 757, 632, 695, 751, 331, 247, 184, 45, 787, 680, 18, 66, 407, MessageEvent.EVENT_CL_OPEN_FAILED, 54, 492, 228, 613, 830, 922, 437, MessageEvent.EVENT_BALANCE_SECURITY_STATE_CHANGE, 644, 905, 789, 420, 305, 441, MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, 300, 892, 827, 141, 537, 381, 662, MessageEvent.EVENT_USER_AGENT_UPDATE, 56, 252, MessageEvent.EVENT_UPLOAD_CONTACTS_FAILED, 242, 797, 838, 837, 720, 224, MessageEvent.EVENT_SIGN_UP_SUCCESS, 631, 61, 87, MessageEvent.EVENT_ROUTER_NEXT, MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS, 756, 665, 397, 808, 851, MessageEvent.EVENT_COUNTRY_CHANGED, 473, 795, 378, 31, 647, 915, 459, 806, 590, 731, 425, JfifUtil.MARKER_SOI, MessageEvent.EVENT_INVEST_INTEREST, 249, 321, 881, 699, 535, 673, 782, 210, 815, 905, 303, 843, 922, 281, 73, 469, 791, 660, 162, 498, MessageEvent.EVENT_LOG_IN_SUCCESS, 155, 422, 907, 817, 187, 62, 16, 425, 535, MessageEvent.EVENT_GRAB_ADD_ADDRESS_SUCCESS, 286, 437, MessageEvent.EVENT_BUY_BUNDLE_SUCCESS, MessageEvent.EVENT_NOTIFICATION_ARRIVE, 610, 296, KkCarPayResultDialog.FREE_RIDE_LOTTIE_HEIGHT_DP, 923, 116, 667, 751, MessageEvent.EVENT_CL_TAKE_PHOTO_SUCCESS, 62, 366, 691, 379, 687, 842, 37, MessageEvent.EVENT_CL_BORROW_FAILED, 720, 742, 330, 5, 39, 923, MessageEvent.EVENT_GRAB_PAY_SUCCESS, 424, 242, 749, 321, 54, 669, 316, 342, 299, 534, 105, 667, 488, 640, 672, MessageEvent.EVENT_UPLOAD_APPSFLYER_CONVERSATION_DONE, 540, 316, 486, 721, 610, 46, 656, 447, 171, 616, 464, 190, MessageEvent.EVENT_GENIEX_BUY_BUNDLE_SUCCESS, 297, 321, 762, 752, 533, 175, 134, 14, 381, 433, 717, 45, HomeDialogState.PRIORITY_HIGHEST_111, 20, 596, 284, 736, 138, 646, 411, 877, 669, 141, 919, 45, 780, 407, 164, 332, 899, 165, 726, LogSeverity.CRITICAL_VALUE, 325, 498, 655, MessageEvent.EVENT_CL_BORROW_FAILED, 752, ViewUtils.EDGE_TO_EDGE_FLAGS, 223, 849, 647, 63, MessageEvent.EVENT_PATTERN_UNLOCK_SUCCESS, 863, 251, 366, 304, MessageEvent.EVENT_REFRESH_BANK_CARD_LIST, 738, 675, 410, MessageEvent.EVENT_AABILL_REFRESH_GROUP_RECORD, 244, 31, 121, 303, 263}};

    private PDF417ErrorCorrection() {
    }

    public static String generateErrorCorrection(CharSequence charSequence, int i7) {
        int errorCorrectionCodewordCount = getErrorCorrectionCodewordCount(i7);
        char[] cArr = new char[errorCorrectionCodewordCount];
        int length = charSequence.length();
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = errorCorrectionCodewordCount - 1;
            int iCharAt = (charSequence.charAt(i10) + cArr[i11]) % PDF417Common.NUMBER_OF_CODEWORDS;
            while (i11 >= 1) {
                cArr[i11] = (char) ((cArr[i11 - 1] + (929 - ((EC_COEFFICIENTS[i7][i11] * iCharAt) % PDF417Common.NUMBER_OF_CODEWORDS))) % PDF417Common.NUMBER_OF_CODEWORDS);
                i11--;
            }
            cArr[0] = (char) ((929 - ((iCharAt * EC_COEFFICIENTS[i7][0]) % PDF417Common.NUMBER_OF_CODEWORDS)) % PDF417Common.NUMBER_OF_CODEWORDS);
        }
        StringBuilder sb2 = new StringBuilder(errorCorrectionCodewordCount);
        for (int i12 = errorCorrectionCodewordCount - 1; i12 >= 0; i12--) {
            char c6 = cArr[i12];
            if (c6 != 0) {
                cArr[i12] = (char) (929 - c6);
            }
            sb2.append(cArr[i12]);
        }
        return sb2.toString();
    }

    public static int getErrorCorrectionCodewordCount(int i7) {
        if (i7 < 0 || i7 > 8) {
            throw new IllegalArgumentException("Error correction level must be between 0 and 8!");
        }
        return 1 << (i7 + 1);
    }

    public static int getRecommendedMinimumErrorCorrectionLevel(int i7) throws WriterException {
        if (i7 <= 0) {
            throw new IllegalArgumentException("n must be > 0");
        }
        if (i7 <= 40) {
            return 2;
        }
        if (i7 <= 160) {
            return 3;
        }
        if (i7 <= 320) {
            return 4;
        }
        if (i7 <= 863) {
            return 5;
        }
        throw new WriterException("No recommendation possible");
    }
}
