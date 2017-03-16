/**
 * Copyright (C) 2015 Zalando SE (http://tech.zalando.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zalando.stups.tokens;

import java.net.URI;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.zalando.stups.tokens.fs.FilesystemSecretsRefresherConfiguration;
import org.zalando.stups.tokens.mcb.MCBConfig;

public interface TokenRefresherConfiguration {

    ClientCredentialsProvider getClientCredentialsProvider();

    UserCredentialsProvider getUserCredentialsProvider();

    int getRefreshPercentLeft();

    int getWarnPercentLeft();

    Set<AccessTokenConfiguration> getAccessTokenConfigurations();

    URI getAccessTokenUri();

    HttpProviderFactory getHttpProviderFactory();

    HttpConfig getHttpConfig();

    int getSchedulingPeriod();

    ScheduledExecutorService getExecutorService();

    URI getTokenInfoUri();

    int getTokenVerifierSchedulingPeriod();

    TokenVerifierProvider getTokenVerifierProvider();

    MCBConfig getTokenRefresherMcbConfig();

    MCBConfig getTokenVerifierMcbConfig();

    MetricsListener getMetricsListener();

    TimeUnit getSchedulingTimeUnit();

    TimeUnit getTokenVerifierSchedulingTimeUnit();

    FilesystemSecretsRefresherConfiguration getFilesystemSecretsRefresherConfiguration();
}
