package J6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import java.util.ArrayList;
import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final EnumMap f4539a;

    static {
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        f4539a = enumMap;
        ArrayList arrayList = new ArrayList();
        arrayList.add(BarcodeFormat.QR_CODE);
        arrayList.add(BarcodeFormat.CODE_128);
        arrayList.add(BarcodeFormat.CODE_39);
        enumMap.put(DecodeHintType.TRY_HARDER, Boolean.TRUE);
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, arrayList);
        enumMap.put(DecodeHintType.CHARACTER_SET, "utf-8");
    }
}
