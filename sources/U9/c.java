package U9;

import C0.G;
import android.text.TextUtils;
import com.transsnet.palmpay.core.bean.PalmPayContact;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements ObservableOnSubscribe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9293b;

    public c(String str, ArrayList arrayList) {
        this.f9292a = str;
        this.f9293b = Collections.unmodifiableList(arrayList);
    }

    public static c a(InputStream inputStream) throws IOException {
        String str;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        byte b7 = dataInputStream.readByte();
        if (b7 == 1) {
            str = "arm64-v8a";
        } else if (b7 == 2) {
            str = "armeabi-v7a";
        } else if (b7 == 3) {
            str = "x86_64";
        } else {
            if (b7 != 4) {
                throw new RuntimeException(G.m(b7, "Unrecognized arch id: "));
            }
            str = "x86";
        }
        int i7 = dataInputStream.readShort() & 65535;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < i7; i10++) {
            byte[] bArr = new byte[dataInputStream.readShort() & 65535];
            dataInputStream.readFully(bArr);
            arrayList.add(new String(bArr, StandardCharsets.UTF_8));
        }
        return new c(str, arrayList);
    }

    @Override // io.reactivex.ObservableOnSubscribe
    public void subscribe(ObservableEmitter observableEmitter) {
        ArrayList arrayList = new ArrayList();
        for (PalmPayContact palmPayContact : this.f9293b) {
            boolean zIsEmpty = TextUtils.isEmpty(palmPayContact.getPhone());
            String str = this.f9292a;
            if (!zIsEmpty && palmPayContact.getPhone().toUpperCase().contains(str.toUpperCase())) {
                arrayList.add(palmPayContact);
            } else if (!TextUtils.isEmpty(palmPayContact.getAlias()) && palmPayContact.getAlias().toUpperCase().contains(str.toUpperCase())) {
                arrayList.add(palmPayContact);
            } else if (!TextUtils.isEmpty(palmPayContact.getFullName()) && palmPayContact.getFullName().toUpperCase().contains(str.toUpperCase())) {
                arrayList.add(palmPayContact);
            }
        }
        observableEmitter.onNext(arrayList);
        observableEmitter.onComplete();
    }

    public c(List list, String str) {
        this.f9293b = list;
        this.f9292a = str;
    }
}
