package androidx.webkit;

import androidx.annotation.UiThread;
import androidx.webkit.internal.o;
import androidx.webkit.internal.q;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@UiThread
public interface ProfileStore {
    static ProfileStore getInstance() {
        if (!o.f18314g.b()) {
            throw o.a();
        }
        if (p183m6.j.f39518d == null) {
            p183m6.j.f39518d = new p183m6.j(q.f18327a.getProfileStore(), 13);
        }
        return p183m6.j.f39518d;
    }

    boolean deleteProfile(String str);

    List<String> getAllProfileNames();

    Profile getOrCreateProfile(String str);

    Profile getProfile(String str);
}
