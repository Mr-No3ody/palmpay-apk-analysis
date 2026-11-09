package p200n7;

import com.luck.picture.lib.permissions.PermissionConfig;
import com.transsnet.palmpay.util.constant.PermissionConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C1847n;
import kotlin.collections.F;
import kotlin.collections.G;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f39853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f39854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f39855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f39856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f39857e;

    static {
        String[] elements = {"android.permission.ACCESS_BACKGROUND_LOCATION", "android.permission.SYSTEM_ALERT_WINDOW", "android.permission.WRITE_SETTINGS", "android.permission.MANAGE_EXTERNAL_STORAGE", "android.permission.REQUEST_INSTALL_PACKAGES", "android.permission.POST_NOTIFICATIONS", "android.permission.BODY_SENSORS_BACKGROUND"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f39853a = C1847n.A(elements);
        Map mapG = G.g(new Pair("android.permission.READ_CALENDAR", PermissionConstants.CALENDAR), new Pair("android.permission.WRITE_CALENDAR", PermissionConstants.CALENDAR), new Pair("android.permission.READ_CALL_LOG", "android.permission-group.CALL_LOG"), new Pair("android.permission.WRITE_CALL_LOG", "android.permission-group.CALL_LOG"), new Pair("android.permission.PROCESS_OUTGOING_CALLS", "android.permission-group.CALL_LOG"), new Pair("android.permission.CAMERA", PermissionConstants.CAMERA), new Pair("android.permission.READ_CONTACTS", PermissionConstants.CONTACTS), new Pair("android.permission.WRITE_CONTACTS", PermissionConstants.CONTACTS), new Pair("android.permission.GET_ACCOUNTS", PermissionConstants.CONTACTS), new Pair("android.permission.ACCESS_FINE_LOCATION", PermissionConstants.LOCATION), new Pair("android.permission.ACCESS_COARSE_LOCATION", PermissionConstants.LOCATION), new Pair("android.permission.ACCESS_BACKGROUND_LOCATION", PermissionConstants.LOCATION), new Pair("android.permission.RECORD_AUDIO", PermissionConstants.MICROPHONE), new Pair("android.permission.READ_PHONE_STATE", PermissionConstants.PHONE), new Pair("android.permission.READ_PHONE_NUMBERS", PermissionConstants.PHONE), new Pair("android.permission.CALL_PHONE", PermissionConstants.PHONE), new Pair("android.permission.ANSWER_PHONE_CALLS", PermissionConstants.PHONE), new Pair("com.android.voicemail.permission.ADD_VOICEMAIL", PermissionConstants.PHONE), new Pair("android.permission.USE_SIP", PermissionConstants.PHONE), new Pair("android.permission.ACCEPT_HANDOVER", PermissionConstants.PHONE), new Pair("android.permission.BODY_SENSORS", PermissionConstants.SENSORS), new Pair("android.permission.ACTIVITY_RECOGNITION", "android.permission-group.ACTIVITY_RECOGNITION"), new Pair("android.permission.SEND_SMS", PermissionConstants.SMS), new Pair("android.permission.RECEIVE_SMS", PermissionConstants.SMS), new Pair("android.permission.READ_SMS", PermissionConstants.SMS), new Pair("android.permission.RECEIVE_WAP_PUSH", PermissionConstants.SMS), new Pair("android.permission.RECEIVE_MMS", PermissionConstants.SMS), new Pair(PermissionConfig.READ_EXTERNAL_STORAGE, PermissionConstants.STORAGE), new Pair(PermissionConfig.WRITE_EXTERNAL_STORAGE, PermissionConstants.STORAGE), new Pair("android.permission.ACCESS_MEDIA_LOCATION", PermissionConstants.STORAGE));
        f39854b = mapG;
        LinkedHashMap linkedHashMapL = G.l(F.b(new Pair("android.permission.MANAGE_EXTERNAL_STORAGE", PermissionConstants.STORAGE)));
        linkedHashMapL.putAll(mapG);
        Map mapK = G.k(linkedHashMapL);
        f39855c = mapK;
        LinkedHashMap linkedHashMapL2 = G.l(G.g(new Pair("android.permission.BLUETOOTH_SCAN", "android.permission-group.NEARBY_DEVICES"), new Pair("android.permission.BLUETOOTH_ADVERTISE", "android.permission-group.NEARBY_DEVICES"), new Pair("android.permission.BLUETOOTH_CONNECT", "android.permission-group.NEARBY_DEVICES")));
        linkedHashMapL2.putAll(mapK);
        Map mapK2 = G.k(linkedHashMapL2);
        f39856d = mapK2;
        LinkedHashMap linkedHashMapL3 = G.l(G.g(new Pair(PermissionConfig.READ_MEDIA_IMAGES, "android.permission-group.READ_MEDIA_VISUAL"), new Pair(PermissionConfig.READ_MEDIA_VIDEO, "android.permission-group.READ_MEDIA_VISUAL"), new Pair(PermissionConfig.READ_MEDIA_AUDIO, "android.permission-group.READ_MEDIA_AURAL"), new Pair("android.permission.POST_NOTIFICATIONS", "android.permission-group.NOTIFICATIONS"), new Pair("android.permission.NEARBY_WIFI_DEVICES", "android.permission-group.NEARBY_DEVICES"), new Pair("android.permission.BODY_SENSORS_BACKGROUND", PermissionConstants.SENSORS)));
        linkedHashMapL3.putAll(mapK2);
        f39857e = G.k(linkedHashMapL3);
    }
}
