package cn.tongdun.android.qgq9qg99.gqgg9q99qg9;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.location.Location;
import android.location.LocationManager;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.adjust.sdk.Constants;
import com.transsnet.palmpay.bean.HomeDialogState;
import java.io.File;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class qqggggg9g9q99q9gq {
    private static List qgqq999g;
    private Class[] gqgg9q99qg9;

    /* JADX INFO: renamed from: q999ggg99999qqggqqg9qg, reason: collision with root package name */
    private int f19091q999ggg99999qqggqqg9qg;
    private Map qg9gqgqqggg9q9qg = new HashMap();
    private String qgq9qg99;
    private String qqggggg9g9q99q9gq;

    static {
        ArrayList arrayList = new ArrayList();
        qgqq999g = arrayList;
        arrayList.add(new qqggggg9g9q99q9gq(0, Settings.System.class.getName(), qgq9qg99("5752417777564b5759", 2), new Class[]{ContentResolver.class, String.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(1, SharedPreferences.Editor.class.getName(), qgq9qg99("40373315153429353b", 96), new Class[]{String.class, String.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(3, TelephonyManager.class.getName(), qgq9qg99("575a497f7e4f49484943535f4f6375", 10), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(4, TelephonyManager.class.getName(), qgq9qg99("5734270e13313d62490d2e393121", 100), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(5, TelephonyManager.class.getName(), qgq9qg99("577467465765697c705a5b", 36), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(6, TelephonyManager.class.getName(), qgq9qg99("572033001b2428240a0e2a2700193a2d2535", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(7, TelephonyManager.class.getName(), qgq9qg99("570417213c023830111d0e0b243d1e090111", 84), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(8, TelephonyManager.class.getName(), qgq9qg99("57687b50417b6972777342467071706c615a5076", 56), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(9, TelephonyManager.class.getName(), qgq9qg99("572d3e15043e2c3732360b103a383c3a343213002327", 125), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(10, TelephonyManager.class.getName(), qgq9qg99("577d6e58457b5d406a686c6a646243507377", 45), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(11, TelephonyManager.class.getName(), qgq9qg99("570310253906000a302c0814", 83), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(12, TelephonyManager.class.getName(), qgq9qg99("573b280312283a2124200614302c", 107), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(13, TelephonyManager.class.getName(), qgq9qg99("57514264755a5373705f51464e5552", 1), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(14, TelephonyManager.class.getName(), qgq9qg99("5741527362505c4945757f4a514055505470705442594542", 17), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(15, WifiInfo.class.getName(), qgq9qg99("574b5870654b6b6c495f5e5f49", 27), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(16, WifiInfo.class.getName(), qgq9qg99("57584b67636b7f5a4c4d4c5a", 8), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(17, WifiInfo.class.getName(), qgq9qg99("57130036110b1c", 67), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(18, WifiInfo.class.getName(), qgq9qg99("570a193e19081205", 90), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(19, WifiManager.class.getName(), qgq9qg99("574a597f644948434e5f554e496f6f4041", 26), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(20, WifiManager.class.getName(), qgq9qg99("57273415092e361c022d2c", 119), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(21, WifiManager.class.getName(), qgq9qg99("5772615740727f4c476676696877", 34), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(22, NetworkInterface.class.getName(), qgq9qg99("5747547f6e54465d585c67625f54525142474353", 23), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(23, Proxy.class.getName(), qgq9qg99("575b48657e455e", 11), new Class[]{Context.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(24, Proxy.class.getName(), qgq9qg99("57657643587a61", 53), new Class[]{Context.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(25, System.class.getName(), qgq9qg99("57041722241b191311000b", 84), new Class[]{String.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(26, PackageManager.class.getName(), qgq9qg99("575c4f637943594b535e57497c6f5c5654585c75715256", 12), new Class[]{String.class}));
        List list = qgqq999g;
        String name = PackageManager.class.getName();
        String strQgq9qg99 = qgq9qg99("570f1c293c0f05070b0f212a0504", 95);
        Class cls = Integer.TYPE;
        list.add(new qqggggg9g9q99q9gq(27, name, strQgq9qg99, new Class[]{String.class, cls}));
        qgqq999g.add(new qqggggg9g9q99q9gq(28, PackageManager.class.getName(), qgq9qg99("57190a263c061c0e161b121a2f2a1913111d190d", 73), new Class[]{cls}));
        qgqq999g.add(new qqggggg9g9q99q9gq(29, File.class.getName(), qgq9qg99("575d4e6a7c4e435c465e4e6a6e4a43", 13), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(30, ActivityManager.class.getName(), qgq9qg99("57726156576b707777794345626868", 34), new Class[]{cls}));
        qgqq999g.add(new qqggggg9g9q99q9gq(31, ComponentName.class.getName(), qgq9qg99("573b281d083b31333f3b12163531", 107), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(32, Modifier.class.getName(), qgq9qg99("597651437971737f", 62), new Class[]{cls}));
        qgqq999g.add(new qqggggg9g9q99q9gq(33, Debug.class.getName(), qgq9qg99("59381503253530222035130e23222924353323", HomeDialogState.PRIORITY_SYSTEM_COMMON_ERROR), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(34, Process.class.getName(), qgq9qg99("5d605d4d79", 38), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(35, TimeZone.class.getName(), qgq9qg99("5765764154715f4e67727176", 53), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(36, TimeZone.class.getName(), qgq9qg99("57647756716161547179616f72", 52), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(37, Locale.class.getName(), qgq9qg99("575c4f667351574c4a585c", 12), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(38, Intent.class.getName(), qgq9qg99("571d0e2238050e1405", 77), new Class[]{String.class}));
        if (Build.VERSION.SDK_INT < 28) {
            qgqq999g.add(new qqggggg9g9q99q9gq(39, Intent.class.getName(), qgq9qg99("5766755559686277", 54), new Class[]{String.class}));
            qgqq999g.add(new qqggggg9g9q99q9gq(2, qgq9qg99("512c29353e252e69623f7e5e092924322b1e013e3c3634253e2f35", 113), qgq9qg99("57687b", 56), new Class[]{String.class, String.class}));
            qgqq999g.add(new qqggggg9g9q99q9gq(63, qgq9qg99("5126233f342f24636835745403232e3821140b34363c3e2f34253f", 123), qgq9qg99("573a29", 106), new Class[]{String.class}));
        }
        qgqq999g.add(new qqggggg9g9q99q9gq(40, Intent.class.getName(), qgq9qg99("573427001b36353f32391d0b3a3025", 100), new Class[]{String.class, Boolean.TYPE}));
        qgqq999g.add(new qqggggg9g9q99q9gq(41, Intent.class.getName(), qgq9qg99("576477505d6b77465b6a6075", 52), new Class[]{String.class, Byte.TYPE}));
        qgqq999g.add(new qqggggg9g9q99q9gq(42, Intent.class.getName(), qgq9qg99("57584b7d615d475c6b67565c49", 8), new Class[]{String.class, Short.TYPE}));
        qgqq999g.add(new qqggggg9g9q99q9gq(43, Intent.class.getName(), qgq9qg99("57180b2d3113092d27161c09", 72), new Class[]{String.class, Character.TYPE}));
        qgqq999g.add(new qqggggg9g9q99q9gq(44, Intent.class.getName(), qgq9qg99("57594a667c416a66575d48", 9), new Class[]{String.class, cls}));
        qgqq999g.add(new qqggggg9g9q99q9gq(45, Intent.class.getName(), qgq9qg99("576f7c554e6c644f50616b7e", 63), new Class[]{String.class, Long.TYPE}));
        qgqq999g.add(new qqggggg9g9q99q9gq(46, Intent.class.getName(), qgq9qg99("576675564e676a715559686277", 54), new Class[]{String.class, Float.TYPE}));
        qgqq999g.add(new qqggggg9g9q99q9gq(47, Intent.class.getName(), qgq9qg99("57495a7b60515c45426b76474d58", 25), new Class[]{String.class, Double.TYPE}));
        qgqq999g.add(new qqggggg9g9q99q9gq(48, Intent.class.getName(), qgq9qg99("572c3f0909283529270c1322283d", 124), new Class[]{String.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(49, Display.class.getName(), qgq9qg99("57746755487b666a", 36), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(50, Display.class.getName(), qgq9qg99("574a59746544464754", 26), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(51, BluetoothAdapter.class.getName(), qgq9qg99("570d1e3a2a0f1918190f", 93), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(52, Settings.Secure.class.getName(), qgq9qg99("57706355557469757b", 32), new Class[]{ContentResolver.class, String.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(53, ActivityManager.class.getName(), qgq9qg99("575c4f6776565c43556e795657", 12), new Class[]{ActivityManager.MemoryInfo.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(54, StatFs.class.getName(), qgq9qg99("572d3e19012c232717153c30", 125), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(55, StatFs.class.getName(), qgq9qg99("5704173028050a0e3e3c15192f25070f", 84), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(56, StatFs.class.getName(), qgq9qg99("576f7c5b436e61654541777677", 63), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(57, StatFs.class.getName(), qgq9qg99("572132150d202f2b0b0f3938391b00222a", 113), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(58, StatFs.class.getName(), qgq9qg99("575e4d696b4b5459515f52557b725f505444", 14), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(59, StatFs.class.getName(), qgq9qg99("574a597d7f5f404d454b46416f664b444050776b4941", 26), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(60, Location.class.getName(), qgq9qg99("57786b42576f67677b6b7b", 40), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(61, Location.class.getName(), qgq9qg99("570e1d342f0d0502110d1d0d", 94), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(62, InetAddress.class.getName(), qgq9qg99("5922071b38272a3b3a30121d382e2f2e38", 106), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(64, LocationManager.class.getName(), qgq9qg99("5745567f6a55407862465f5e65644b45525a4146", 21), new Class[]{String.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(65, Camera.class.getName(), qgq9qg99("433a3d080e3b3f33203e0f1d31202d2b3b", 126), new Class[]{SurfaceTexture.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(66, Camera.class.getName(), qgq9qg99("43101722241115190a1432240b060805040e3a381b1a2c3115060511", 84), new Class[]{Camera.PreviewCallback.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(67, Camera.class.getName(), qgq9qg99("51787d5a5f707d737e7f75544a6e7d7e6a", 47), new Class[]{byte[].class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(68, Camera.class.getName(), qgq9qg99("434443767045414d5e4066705f525c51505a", 0), new Class[]{Camera.PreviewCallback.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(69, Camera.class.getName(), qgq9qg99("4317103a200a373a061a252316121e0d1335230c010f020309", 83), new Class[]{Camera.PreviewCallback.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(70, Camera.class.getName(), qgq9qg99("443926221915263b2d2b3b", 126), new Class[]{Camera.ShutterCallback.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(71, Camera.class.getName(), qgq9qg99("434c5e584d6f695c58544759", 25), new Class[0]));
        qgqq999g.add(new qqggggg9g9q99q9gq(72, Camera.class.getName(), qgq9qg99("432522171124202c3f21001e29302f3e2b", 97), new Class[]{SurfaceHolder.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(73, CameraManager.class.getName(), qgq9qg99("5f4e445a7c735d594642", 3), new Class[]{String.class, CameraDevice.StateCallback.class, Handler.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(74, CameraManager.class.getName(), qgq9qg99("5f222836101f31352a2e", HomeDialogState.PRIORITY_HIGHEST_111), new Class[]{String.class, Executor.class, CameraDevice.StateCallback.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(75, CaptureRequest.Builder.class.getName(), qgq9qg99("511217272204021506", 69), new Class[]{Surface.class}));
        qgqq999g.add(new qqggggg9g9q99q9gq(76, CaptureRequest.Builder.class.getName(), qgq9qg99("525259404d", 23), new Class[0]));
    }

    public qqggggg9g9q99q9gq() {
    }

    private static String qgq9qg99(String str, int i7) {
        try {
            int length = str.length() / 2;
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 << 1;
                bArr[i10] = (byte) ("0123456789abcdef".indexOf(charArray[i11 + 1]) | ("0123456789abcdef".indexOf(charArray[i11]) << 4));
            }
            byte b7 = (byte) (i7 ^ 82);
            byte b10 = (byte) (bArr[0] ^ 48);
            bArr[0] = b10;
            for (int i12 = 1; i12 < length; i12++) {
                b10 = (byte) ((b10 ^ bArr[i12]) ^ b7);
                bArr[i12] = b10;
            }
            return new String(bArr, Constants.ENCODING);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public final void q999ggg99999qqggqqg9qg() {
        this.qg9gqgqqggg9q9qg.clear();
    }

    public final String toString() {
        return new JSONObject(this.qg9gqgqqggg9q9qg).toString();
    }

    private qqggggg9g9q99q9gq(int i7, String str, String str2, Class[] clsArr) {
        this.f19091q999ggg99999qqggqqg9qg = i7;
        this.qgq9qg99 = str;
        this.qqggggg9g9q99q9gq = str2;
        this.gqgg9q99qg9 = clsArr;
    }

    public final void q999ggg99999qqggqqg9qg(String str, int i7) {
        if (!this.qg9gqgqqggg9q9qg.containsKey(str)) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(i7));
            this.qg9gqgqqggg9q9qg.put(str, hashSet);
        } else {
            Set set = (Set) this.qg9gqgqqggg9q9qg.get(str);
            if (set != null) {
                set.add(Integer.valueOf(i7));
            }
        }
    }

    public static int q999ggg99999qqggqqg9qg(String str) {
        for (qqggggg9g9q99q9gq qqggggg9g9q99q9gqVar : qgqq999g) {
            if (str.contains(qqggggg9g9q99q9gqVar.qgq9qg99) && str.contains(qqggggg9g9q99q9gqVar.qqggggg9g9q99q9gq)) {
                Class[] clsArr = qqggggg9g9q99q9gqVar.gqgg9q99qg9;
                StringBuilder sb2 = new StringBuilder();
                for (Class cls : clsArr) {
                    if (sb2.length() > 0) {
                        sb2.append(qgq9qg99("1c", 115));
                    }
                    sb2.append(cls.getName());
                }
                if (str.contains(sb2.toString())) {
                    return qqggggg9g9q99q9gqVar.f19091q999ggg99999qqggqqg9qg;
                }
            }
        }
        return -1;
    }
}
