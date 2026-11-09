package mh;

import android.view.View;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends V6.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f39787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public B8.d f39788d;

    @Override // V6.a
    public final void b() {
        setContentView(p349x8.b.mtn_retainment_dialog_layout);
        this.f39787c = (TextView) findViewById(p349x8.a.mtn_yes_exit);
        final int i7 = 0;
        ((TextView) findViewById(p349x8.a.mtn_no_continue)).setOnClickListener(new View.OnClickListener(this) { // from class: mh.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f39786b;

            {
                this.f39786b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        this.f39786b.dismiss();
                        break;
                    default:
                        g gVar = this.f39786b;
                        gVar.dismiss();
                        B8.d dVar = gVar.f39788d;
                        if (dVar != null) {
                            dVar.a();
                        }
                        break;
                }
            }
        });
        final int i10 = 1;
        this.f39787c.setOnClickListener(new View.OnClickListener(this) { // from class: mh.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f39786b;

            {
                this.f39786b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.f39786b.dismiss();
                        break;
                    default:
                        g gVar = this.f39786b;
                        gVar.dismiss();
                        B8.d dVar = gVar.f39788d;
                        if (dVar != null) {
                            dVar.a();
                        }
                        break;
                }
            }
        });
    }
}
