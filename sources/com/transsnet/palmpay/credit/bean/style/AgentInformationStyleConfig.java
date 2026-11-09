package com.transsnet.palmpay.credit.bean.style;

import com.transsnet.palmpay.core.bean.style_config.BaseStyleConfig;
import com.transsnet.palmpay.core.bean.style_config.TextStyleConfig;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/transsnet/palmpay/credit/bean/style/AgentInformationStyleConfig;", "", "<init>", "()V", "agentInfoBg", "Lcom/transsnet/palmpay/core/bean/style_config/BaseStyleConfig;", "agentInfoTitle", "Lcom/transsnet/palmpay/core/bean/style_config/TextStyleConfig;", "agentInfoNameTitle", "agentInfoName", "agentInfoPhoneNoTitle", "agentInfoPhoneNo", "agentInfoRowLeadingIcon", "agentInfoPhoneIcon", "toString", "", "module_flexi_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AgentInformationStyleConfig {

    @JvmField
    @Nullable
    public BaseStyleConfig agentInfoBg;

    @JvmField
    @Nullable
    public TextStyleConfig agentInfoName;

    @JvmField
    @Nullable
    public TextStyleConfig agentInfoNameTitle;

    @JvmField
    @Nullable
    public BaseStyleConfig agentInfoPhoneIcon;

    @JvmField
    @Nullable
    public TextStyleConfig agentInfoPhoneNo;

    @JvmField
    @Nullable
    public TextStyleConfig agentInfoPhoneNoTitle;

    @JvmField
    @Nullable
    public BaseStyleConfig agentInfoRowLeadingIcon;

    @JvmField
    @Nullable
    public TextStyleConfig agentInfoTitle;

    @NotNull
    public String toString() {
        return "AgentInformationStyleConfig(agentInfoBg=" + this.agentInfoBg + ", agentInfoTitle=" + this.agentInfoTitle + ", agentInfoNameTitle=" + this.agentInfoNameTitle + ", agentInfoName=" + this.agentInfoName + ", agentInfoPhoneNoTitle=" + this.agentInfoPhoneNoTitle + ", agentInfoPhoneNo=" + this.agentInfoPhoneNo + ", agentInfoRowLeadingIcon=" + this.agentInfoRowLeadingIcon + ", agentInfoPhoneIcon=" + this.agentInfoPhoneIcon + ")";
    }
}
