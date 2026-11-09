package Nd;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.photograph.PhotoPickerActivity;
import com.transsnet.palmpay.share.ShareChooseActivity;
import com.transsnet.palmpay.share.ShareItem;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.Adapter f6385c;

    public /* synthetic */ d(RecyclerView.Adapter adapter, int i7, int i10) {
        this.f6383a = i10;
        this.f6385c = adapter;
        this.f6384b = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f6383a) {
            case 0:
                f fVar = (f) this.f6385c;
                ShareChooseActivity shareChooseActivity = fVar.f6391c;
                if (shareChooseActivity != null) {
                    shareChooseActivity.onItemClick((ShareItem) fVar.f6390b.get(this.f6384b));
                }
                break;
            case 1:
                Zc.a aVar = (Zc.a) this.f6385c;
                if (aVar.f11613c != null) {
                    int i7 = aVar.f11614d;
                    int i10 = this.f6384b;
                    aVar.f11614d = i10;
                    aVar.notifyItemChanged(i7);
                    aVar.notifyItemChanged(aVar.f11614d);
                    aVar.f11613c.onItemClick((Zc.b) aVar.f11611a.get(i10));
                }
                break;
            default:
                Zc.f fVar2 = (Zc.f) this.f6385c;
                PhotoPickerActivity photoPickerActivity = fVar2.f11629c;
                if (photoPickerActivity != null) {
                    photoPickerActivity.onItemClick((Uri) fVar2.f11627a.get(this.f6384b));
                }
                break;
        }
    }
}
