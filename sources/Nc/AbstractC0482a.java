package Nc;

import C9.V;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.transsnet.palmpay.custom_view.interfac.OnItemClickListener;

/* JADX INFO: renamed from: Nc.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0482a extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OnItemClickListener f6305a;

    public AbstractC0482a(View view) {
        super(view);
        new SparseArray();
    }

    public void a(int i7, Object obj) {
        this.itemView.setOnClickListener(new V(this, 2, obj, false));
    }

    public void b(Bundle bundle) {
    }
}
