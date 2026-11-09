package E6;

import Ae.j;
import C0.G;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import com.palmpay.lib.liveness.voice.VoicePlayer;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements VoicePlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public MediaPlayer f2250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f2252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f2253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f2254f;

    public c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f2249a = context;
        this.f2254f = new Handler(Looper.getMainLooper());
    }

    @Override // com.palmpay.lib.liveness.voice.VoicePlayer
    public final void play(String textOrKey) {
        Intrinsics.checkNotNullParameter(textOrKey, "textOrKey");
        if (this.f2251c && Intrinsics.c(this.f2252d, textOrKey)) {
            return;
        }
        stop();
        this.f2252d = textOrKey;
        Context context = this.f2249a;
        int identifier = context.getResources().getIdentifier(G.o("lib_liveness_action_", textOrKey), "raw", context.getPackageName());
        Handler handler = this.f2254f;
        if (identifier == 0) {
            int i7 = p292t6.a.f42345a;
            String msg = "could not find file: " + textOrKey;
            Intrinsics.checkNotNullParameter("MediaPlayerVoicePlayer", "tag");
            Intrinsics.checkNotNullParameter(msg, "msg");
            handler.post(new b(this, 1));
            return;
        }
        try {
            final MediaPlayer mediaPlayerCreate = MediaPlayer.create(context, identifier);
            if (mediaPlayerCreate != null) {
                mediaPlayerCreate.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: E6.a
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        c cVar = this.f2245a;
                        cVar.f2251c = false;
                        mediaPlayerCreate.release();
                        cVar.f2250b = null;
                        cVar.f2254f.post(new b(cVar, 2));
                    }
                });
                this.f2251c = true;
                mediaPlayerCreate.start();
            } else {
                mediaPlayerCreate = null;
            }
            this.f2250b = mediaPlayerCreate;
            Unit unit = Unit.f38893a;
        } catch (Exception e10) {
            e10.printStackTrace();
            handler.post(new b(this, 0));
        }
    }

    @Override // com.palmpay.lib.liveness.voice.VoicePlayer
    public final void release() {
        stop();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.palmpay.lib.liveness.voice.VoicePlayer
    public final void stop() {
        try {
            MediaPlayer mediaPlayer = this.f2250b;
            if (mediaPlayer != null) {
                if (this.f2251c) {
                    mediaPlayer.stop();
                }
                mediaPlayer.release();
            }
        } catch (IllegalStateException e10) {
            e10.printStackTrace();
        } finally {
            this.f2250b = null;
            this.f2251c = false;
            this.f2252d = null;
        }
    }
}
