# Introduction #

BoneCP连接池使用


# Details #
```
DatasourceConfig config = new DatasourceConfig();
config.setDriverClass(driver);
config.setJdbcUrl(url);
config.setUsername(username);
config.setPassword(password);
Map<String, String> poolPerperties = new HashMap<String, String>();
//设置连接池类型为 BoneCP
poolPerperties.put("___POOL_TYPE_", "BoneCP");
//设置 BoneCP连接池的参数
poolPerperties.put("idleConnectionTestPeriod", "1");
poolPerperties.put("idleMaxAge", "40");
poolPerperties.put("maxConnectionsPerPartition", "20");
poolPerperties.put("minConnectionsPerPartition", "5");
poolPerperties.put("partitionCount", "3");
poolPerperties.put("acquireIncrement", "2");
poolPerperties.put("acquireRetryAttempts", "10");
poolPerperties.put("acquireRetryDelay", "500");
poolPerperties.put("connectionTimeout", "5000");
poolPerperties.put("statementsCacheSize", "50");
poolPerperties.put("releaseHelperThreads", "3");
//使用连接池
config.setPoolPerperties(poolPerperties);
```
附：
BoneCP连接池可设参数如下：

idleConnectionTestPeriod

idleMaxAge

maxConnectionsPerPartition

minConnectionsPerPartition

partitionCount

acquireIncrement

acquireRetryAttempts

acquireRetryDelay

connectionTimeout

statementsCacheSize

releaseHelperThreads