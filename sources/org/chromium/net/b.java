package org.chromium.net;

import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements ExperimentalOptionsTranslatingCronetEngineBuilder$ExperimentalOptionsPatch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41021b;

    public /* synthetic */ b(Object obj, int i7) {
        this.f41020a = i7;
        this.f41021b = obj;
    }

    @Override // org.chromium.net.ExperimentalOptionsTranslatingCronetEngineBuilder$ExperimentalOptionsPatch
    public final void applyTo(JSONObject jSONObject) throws JSONException {
        switch (this.f41020a) {
            case 0:
                JSONObject jSONObjectA = c.a("AsyncDNS", jSONObject);
                DnsOptions dnsOptions = (DnsOptions) this.f41021b;
                if (dnsOptions.getUseBuiltInDnsResolver() != null) {
                    jSONObjectA.put("enable", dnsOptions.getUseBuiltInDnsResolver());
                }
                JSONObject jSONObjectA2 = c.a("StaleDNS", jSONObject);
                if (dnsOptions.getEnableStaleDns() != null) {
                    jSONObjectA2.put("enable", dnsOptions.getEnableStaleDns());
                }
                if (dnsOptions.getPersistHostCache() != null) {
                    jSONObjectA2.put("persist_to_disk", dnsOptions.getPersistHostCache());
                }
                if (dnsOptions.getPersistHostCachePeriodMillis() != null) {
                    jSONObjectA2.put("persist_delay_ms", dnsOptions.getPersistHostCachePeriodMillis());
                }
                if (dnsOptions.getStaleDnsOptions() != null) {
                    DnsOptions.StaleDnsOptions staleDnsOptions = dnsOptions.getStaleDnsOptions();
                    if (staleDnsOptions.getAllowCrossNetworkUsage() != null) {
                        jSONObjectA2.put("allow_other_network", staleDnsOptions.getAllowCrossNetworkUsage());
                    }
                    if (staleDnsOptions.getFreshLookupTimeoutMillis() != null) {
                        jSONObjectA2.put("delay_ms", staleDnsOptions.getFreshLookupTimeoutMillis());
                    }
                    if (staleDnsOptions.getUseStaleOnNameNotResolved() != null) {
                        jSONObjectA2.put("use_stale_on_name_not_resolved", staleDnsOptions.getUseStaleOnNameNotResolved());
                    }
                    if (staleDnsOptions.getMaxExpiredDelayMillis() != null) {
                        jSONObjectA2.put("max_expired_time_ms", staleDnsOptions.getMaxExpiredDelayMillis());
                    }
                }
                JSONObject jSONObjectA3 = c.a("QUIC", jSONObject);
                if (dnsOptions.getPreestablishConnectionsToStaleDnsResults() != null) {
                    jSONObjectA3.put("race_stale_dns_on_connection", dnsOptions.getPreestablishConnectionsToStaleDnsResults());
                    return;
                }
                return;
            case 1:
                JSONObject jSONObjectA4 = c.a("QUIC", jSONObject);
                ConnectionMigrationOptions connectionMigrationOptions = (ConnectionMigrationOptions) this.f41021b;
                if (connectionMigrationOptions.getEnableDefaultNetworkMigration() != null) {
                    jSONObjectA4.put("migrate_sessions_on_network_change_v2", connectionMigrationOptions.getEnableDefaultNetworkMigration());
                }
                if (connectionMigrationOptions.getAllowServerMigration() != null) {
                    jSONObjectA4.put("allow_server_migration", connectionMigrationOptions.getAllowServerMigration());
                }
                if (connectionMigrationOptions.getMigrateIdleConnections() != null) {
                    jSONObjectA4.put("migrate_idle_sessions", connectionMigrationOptions.getMigrateIdleConnections());
                }
                if (connectionMigrationOptions.getIdleMigrationPeriodSeconds() != null) {
                    jSONObjectA4.put("idle_session_migration_period_seconds", connectionMigrationOptions.getIdleMigrationPeriodSeconds());
                }
                if (connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork() != null) {
                    jSONObjectA4.put("retry_on_alternate_network_before_handshake", connectionMigrationOptions.getRetryPreHandshakeErrorsOnAlternateNetwork());
                }
                if (connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds() != null) {
                    jSONObjectA4.put("max_time_on_non_default_network_seconds", connectionMigrationOptions.getMaxTimeOnNonDefaultNetworkSeconds());
                }
                if (connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount() != null) {
                    jSONObjectA4.put("max_migrations_to_non_default_network_on_path_degrading", connectionMigrationOptions.getMaxPathDegradingEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount() != null) {
                    jSONObjectA4.put("max_migrations_to_non_default_network_on_write_error", connectionMigrationOptions.getMaxWriteErrorEagerMigrationsCount());
                }
                if (connectionMigrationOptions.getEnablePathDegradationMigration() != null) {
                    boolean zBooleanValue = connectionMigrationOptions.getEnablePathDegradationMigration().booleanValue();
                    if (connectionMigrationOptions.getAllowNonDefaultNetworkUsage() != null) {
                        boolean zBooleanValue2 = connectionMigrationOptions.getAllowNonDefaultNetworkUsage().booleanValue();
                        if (!zBooleanValue && zBooleanValue2) {
                            throw new IllegalArgumentException("Unable to turn on non-default network usage without path degradation migration!");
                        }
                        if (zBooleanValue && zBooleanValue2) {
                            jSONObjectA4.put("migrate_sessions_early_v2", true);
                            return;
                        }
                        jSONObjectA4.put("migrate_sessions_early_v2", false);
                    }
                    jSONObjectA4.put("allow_port_migration", zBooleanValue);
                    return;
                }
                return;
            default:
                JSONObject jSONObjectA5 = c.a("QUIC", jSONObject);
                QuicOptions quicOptions = (QuicOptions) this.f41021b;
                if (!quicOptions.getQuicHostAllowlist().isEmpty()) {
                    Set<String> quicHostAllowlist = quicOptions.getQuicHostAllowlist();
                    StringBuilder sb2 = new StringBuilder();
                    Iterator<T> it = quicHostAllowlist.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb2.append((CharSequence) it.next());
                            if (it.hasNext()) {
                                sb2.append((CharSequence) ",");
                            }
                        }
                    }
                    jSONObjectA5.put("host_whitelist", sb2.toString());
                }
                if (!quicOptions.getEnabledQuicVersions().isEmpty()) {
                    Set<String> enabledQuicVersions = quicOptions.getEnabledQuicVersions();
                    StringBuilder sb3 = new StringBuilder();
                    Iterator<T> it2 = enabledQuicVersions.iterator();
                    if (it2.hasNext()) {
                        while (true) {
                            sb3.append((CharSequence) it2.next());
                            if (it2.hasNext()) {
                                sb3.append((CharSequence) ",");
                            }
                        }
                    }
                    jSONObjectA5.put("quic_version", sb3.toString());
                }
                if (!quicOptions.getConnectionOptions().isEmpty()) {
                    Set<String> connectionOptions = quicOptions.getConnectionOptions();
                    StringBuilder sb4 = new StringBuilder();
                    Iterator<T> it3 = connectionOptions.iterator();
                    if (it3.hasNext()) {
                        while (true) {
                            sb4.append((CharSequence) it3.next());
                            if (it3.hasNext()) {
                                sb4.append((CharSequence) ",");
                            }
                        }
                    }
                    jSONObjectA5.put("connection_options", sb4.toString());
                }
                if (!quicOptions.getClientConnectionOptions().isEmpty()) {
                    Set<String> clientConnectionOptions = quicOptions.getClientConnectionOptions();
                    StringBuilder sb5 = new StringBuilder();
                    Iterator<T> it4 = clientConnectionOptions.iterator();
                    if (it4.hasNext()) {
                        while (true) {
                            sb5.append((CharSequence) it4.next());
                            if (it4.hasNext()) {
                                sb5.append((CharSequence) ",");
                            }
                        }
                    }
                    jSONObjectA5.put("client_connection_options", sb5.toString());
                }
                if (!quicOptions.getExtraQuicheFlags().isEmpty()) {
                    Set<String> extraQuicheFlags = quicOptions.getExtraQuicheFlags();
                    StringBuilder sb6 = new StringBuilder();
                    Iterator<T> it5 = extraQuicheFlags.iterator();
                    if (it5.hasNext()) {
                        while (true) {
                            sb6.append((CharSequence) it5.next());
                            if (it5.hasNext()) {
                                sb6.append((CharSequence) ",");
                            }
                        }
                    }
                    jSONObjectA5.put("set_quic_flags", sb6.toString());
                }
                if (quicOptions.getInMemoryServerConfigsCacheSize() != null) {
                    jSONObjectA5.put("max_server_configs_stored_in_properties", quicOptions.getInMemoryServerConfigsCacheSize());
                }
                if (quicOptions.getHandshakeUserAgent() != null) {
                    jSONObjectA5.put("user_agent_id", quicOptions.getHandshakeUserAgent());
                }
                if (quicOptions.getRetryWithoutAltSvcOnQuicErrors() != null) {
                    jSONObjectA5.put("retry_without_alt_svc_on_quic_errors", quicOptions.getRetryWithoutAltSvcOnQuicErrors());
                }
                if (quicOptions.getEnableTlsZeroRtt() != null) {
                    jSONObjectA5.put("disable_tls_zero_rtt", !quicOptions.getEnableTlsZeroRtt().booleanValue());
                }
                if (quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds() != null) {
                    jSONObjectA5.put("max_idle_time_before_crypto_handshake_seconds", quicOptions.getPreCryptoHandshakeIdleTimeoutSeconds());
                }
                if (quicOptions.getCryptoHandshakeTimeoutSeconds() != null) {
                    jSONObjectA5.put("max_time_before_crypto_handshake_seconds", quicOptions.getCryptoHandshakeTimeoutSeconds());
                }
                if (quicOptions.getIdleConnectionTimeoutSeconds() != null) {
                    jSONObjectA5.put("idle_connection_timeout_seconds", quicOptions.getIdleConnectionTimeoutSeconds());
                }
                if (quicOptions.getRetransmittableOnWireTimeoutMillis() != null) {
                    jSONObjectA5.put("retransmittable_on_wire_timeout_milliseconds", quicOptions.getRetransmittableOnWireTimeoutMillis());
                }
                if (quicOptions.getCloseSessionsOnIpChange() != null) {
                    jSONObjectA5.put("close_sessions_on_ip_change", quicOptions.getCloseSessionsOnIpChange());
                }
                if (quicOptions.getGoawaySessionsOnIpChange() != null) {
                    jSONObjectA5.put("goaway_sessions_on_ip_change", quicOptions.getGoawaySessionsOnIpChange());
                }
                if (quicOptions.getInitialBrokenServicePeriodSeconds() != null) {
                    jSONObjectA5.put("initial_delay_for_broken_alternative_service_seconds", quicOptions.getInitialBrokenServicePeriodSeconds());
                }
                if (quicOptions.getIncreaseBrokenServicePeriodExponentially() != null) {
                    jSONObjectA5.put("exponential_backoff_on_initial_delay", quicOptions.getIncreaseBrokenServicePeriodExponentially());
                }
                if (quicOptions.getDelayJobsWithAvailableSpdySession() != null) {
                    jSONObjectA5.put("delay_main_job_with_available_spdy_session", quicOptions.getDelayJobsWithAvailableSpdySession());
                    return;
                }
                return;
        }
    }
}
