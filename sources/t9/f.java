package t9;

import Pa.r0;
import android.widget.ImageView;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.transsnet.palmpay.teller.bean.resp.BettingMatchDetailBean;
import com.transsnet.palmpay.util.TimeUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends M1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f42361a;

    @Override // M1.j
    public final void convert(BaseViewHolder holder, Object obj) {
        String str;
        BettingMatchDetailBean item = (BettingMatchDetailBean) obj;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        int i7 = Pd.c.qibrsTitle;
        String competitionName = item.getCompetitionName();
        if (competitionName == null) {
            competitionName = "";
        }
        String matchName = item.getMatchName();
        holder.setText(i7, competitionName + " " + (matchName != null ? matchName : ""));
        ImageView imageView = (ImageView) holder.getView(Pd.c.qibrsTitleIcon);
        if (imageView != null) {
            String logo = item.getLogo();
            p220oa.h.s(imageView, !(logo == null || logo.length() == 0));
            r0.l1(item.getLogo(), imageView);
        }
        int i10 = Pd.c.qbrsiTime;
        Long matchTime = item.getMatchTime();
        holder.setText(i10, r0.X1(Long.valueOf(matchTime != null ? matchTime.longValue() : 0L), "HH:mm"));
        int i11 = Pd.c.qbrsiDate;
        Long matchTime2 = item.getMatchTime();
        long jLongValue = matchTime2 != null ? matchTime2.longValue() : 0L;
        Date date = new Date(jLongValue);
        if (TimeUtils.isToday(jLongValue)) {
            str = "Today";
        } else if (TimeUtils.isYesterday(jLongValue)) {
            str = "Yesterday";
        } else {
            str = TimeUtils.isTomorrow(jLongValue) ? "Tomorrow" : new SimpleDateFormat("EE, MMM dd", Locale.ENGLISH).format(date);
        }
        holder.setText(i11, str);
        r0.h1((ImageView) holder.getView(Pd.c.qbrsiTeam1Icon), item.getTeamFlag(), Pd.b.qt_betting_race_schedule_default);
        r0.h1((ImageView) holder.getView(Pd.c.qbrsiTeam2Icon), item.getOpTeamFlag(), Pd.b.qt_betting_race_schedule_default);
        holder.setText(Pd.c.qbrsiTeam1Name, item.getTeamName());
        holder.setText(Pd.c.qbrsiTeam2Name, item.getOpTeamName());
        holder.setGone(Pd.c.tvMore, !this.f42361a);
    }
}
