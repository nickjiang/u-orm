# Introduction #

c3p0连接池使用


# Details #
```
DatasourceConfig config = new DatasourceConfig();
config.setDriverClass(driver);
config.setJdbcUrl(url);
config.setUsername(username);
config.setPassword(password);
Map<String, String> poolPerperties = new HashMap<String, String>();
//设置连接池类型为 c3p0
poolPerperties.put("___POOL_TYPE_", "c3p0");
//设置 c3p0连接池的参数
poolPerperties.put("initialPoolSize", "2");
poolPerperties.put("maxIdleTime", "600");
poolPerperties.put("idleConnectionTestPeriod", "600");
//使用连接池
config.setPoolPerperties(poolPerperties);
```
附：
c3p0连接池可设参数如下：

checkoutTimeout

initialPoolSize

minPoolSize

maxPoolSize

acquireIncrement

maxIdleTime

idleConnectionTestPeriod

acquireRetryAttempts

acquireRetryDelay