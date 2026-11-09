package Zc;

import android.view.View;
import android.view.animation.Animation;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.photograph.OnItemClickListener;
import com.transsnet.palmpay.photograph.PhotoFolderViewController$OnClickFolderCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f11618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f11619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f11620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PhotoFolderViewController$OnClickFolderCallback f11621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Animation f11622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Animation f11623f;

    public final void a() {
        this.f11618a.setVisibility(8);
        Animation animation = this.f11623f;
        RecyclerView recyclerView = this.f11619b;
        recyclerView.startAnimation(animation);
        recyclerView.setVisibility(8);
    }

    @Override // com.transsnet.palmpay.photograph.OnItemClickListener
    public final void onItemClick(Object obj) {
        b bVar = (b) obj;
        PhotoFolderViewController$OnClickFolderCallback photoFolderViewController$OnClickFolderCallback = this.f11621d;
        if (photoFolderViewController$OnClickFolderCallback != null) {
            photoFolderViewController$OnClickFolderCallback.onClick(bVar);
        }
    }
}
