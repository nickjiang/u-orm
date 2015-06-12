u-orm 是一个适用、快速、简单、轻量级的 Java ORM 小型框架,无第三方包依赖，只有一个commons-logging.jar ，为了日志输出。整个jar包只有121KB，并封装了很多实用的操作函数，详细见api中的org.uorm.dao.common.ICommonDao 。

enjoy it! just make your own simple orm.

## POJO生成工具 ##
提供数据库对应ORM类生成工具，详见Wiki里的“POJO生成工具”

## 使用简单 ##
使用简单、上手快、灵活，无需学习HQL、Mybatis等，只需要会sql就行。
使用示例：
```
String driver = "com.mysql.jdbc.Driver";//"oracle.jdbc.driver.OracleDriver";
		/**连接字串 */
		String url = "jdbc:mysql://127.0.0.1/simdb";//"jdbc:oracle:thin:@127.0.0.1:1521:orcl";
		/** 数据库用户名 */
		String username = "root";//"cctv";//"root";
		/** 数据库密码 */
		String password = "root";//"1";//"root";
		long start = System.currentTimeMillis();
		DatasourceConfig config = new DatasourceConfig();
		config.setDriverClass(driver);
		config.setJdbcUrl(url);
		config.setUsername(username);
		config.setPassword(password);
		Map<String, String> poolPerperties = new HashMap<String, String>();
		//使用c3p0连接池
                poolPerperties.put("___POOL_TYPE_", "c3p0");
		poolPerperties.put("initialPoolSize", "2");
		poolPerperties.put("maxIdleTime", "600");
		poolPerperties.put("idleConnectionTestPeriod", "600");
		//装配c3p0连接池，不设置，代表不使用连接池，直接使用JDBC。
                //内置支持c3p0和BoneCP
		config.setPoolPerperties(poolPerperties);
		//ConnectionFactory可扩展自己的实现，支持你需要的连接池和业务逻辑
		ConnectionFactory connectionFactory = new DefaultConnectionFactory(config);
		ICommonDao dao = new CommonDaoImpl(connectionFactory );
//		dao.beginTransation();
                //按主键查
		User user = dao.queryBusinessObjByPk(User.class, 1);
		System.out.println(user.getLoginName());
		System.out.println("耗时：" + (System.currentTimeMillis() - start) + " ms");
		start = System.currentTimeMillis();
		List<User> users = dao.queryBusinessObjs(User.class, "select t.*, 'test' from UUM_USER t");
		System.out.println(users.size() + "," + users.get(0).getLoginName());
		Long count = dao.querySingleObject(Long.class, "select count(*) from UUM_USER");
		System.out.println(count);
		List<Map<String, Object>> userListMap = dao.queryForListMap("select * from UUM_USER");
		for (Map<String, Object> map : userListMap) {
			for (String key : map.keySet()) {
				System.out.println(key + " = " + map.get(key));
			}
			System.out.println("----------------------");
		}
		Map<String, Object> u = dao.queryForMap("select * from UUM_USER");
		for (String key : u.keySet()) {
			System.out.println(key + " = " + u.get(key));
		}
		User uu = dao.querySingleObject(User.class, "select * from UUM_USER");
		System.out.println(uu.getLoginName());
		users = dao.queryBusinessObjs(User.class, "select * from UUM_USER where ID = ?", 0, 102, new SqlParameter(User.PROP_ID, 1));
		System.out.println("===============================");
		System.out.println(users.size());
		for(User ue : users){
			System.out.println(ue.getLoginName());
		}
                //分页查询
//		PaginationSupport<User> upage = dao.queryByPagedQuery(User.class, "select * from UUM_USER where ID = ?", 0, 10, new SqlParameter(User.PROP_ID, 1));
		PaginationSupport<User> upage = dao.queryByPagedQuery(User.class, "select * from UUM_USER", 1, 10);
		System.out.println("*************************************");
		System.out.println("total = " + upage.getTotalCount() + ", page count = " + upage.getPageCount());
		users = upage.getItems();
		System.out.println(users.size());
		for(User ue : users){
			System.out.println(ue.getLoginName());
		}
		System.out.println("---------- delete -------------------");
		System.out.println(dao.deleteBusiness(users.get(0)));
//		System.out.println("---------- update -------------------");
//		user.setUserName(user.getLoginName());
//		user.setPassword("123456");
//		user.setBirthday(new Date());
//		System.out.println(dao.updateBusinessObjs(false, user));
//		System.out.println("---------- save -------------------");
		List<User> userss = new ArrayList<User>();
		for(int i = 207; i <= 1+207; i ++){
			User uus = new User();//new User(i);
			uus.setLoginName("loginname-"+Utils.genRandomNum(6));
			uus.setUserName("username-"+ Utils.genRandomNum(6));
			uus.setPassword("password-"+i);
			uus.setDescription("desc-"+i);
			uus.setState(i);
			uus.setCreateTime(new Timestamp(System.currentTimeMillis()));
			uus.setUserCard("usercard-"+i);
			uus.setUserType(i);
			uus.setEmail("email-"+i);
			uus.setSex(i);
			uus.setAddress("address-"+i);
			uus.setBirthday(new Timestamp(System.currentTimeMillis()));
//			uus.setTest("ddd");
			userss.add(uus);
		}
		System.out.println(dao.saveBusinessObjs(userss));
//		dao.commitTransation();
		
		/**test id generator*/
//		User us =  new User();
//		us.setLoginName("loginname-id");
//		us.setUserName("username-id");
//		us.setPassword("password-id");
//		us.setDescription("desc-id");
//		us.setState(1);
//		us.setCreateTime(new Date());
//		us.setUserCard("usercard-id");
//		us.setUserType(1);
//		us.setEmail("email-id");
//		us.setSex(1);
//		us.setAddress("address-id");
//		us.setBirthday(new Date());
//		System.out.println(dao.saveBusinessObjs(us));
//		System.out.println(us.getId());
//		TestUuid test = new TestUuid();
//		test.setSeqNum(10);
//		System.out.println(dao.saveBusinessObjs(test));
//		System.out.println(test.getId());
		
		/**test lob*/
//		CimData cimdata = dao.queryBusinessObjByPk(CimData.class, 2, 1);
//		System.out.println(cimdata.getCimClassId());
//		System.out.println(new String(cimdata.getCimOp()));
//		System.out.println(new String(cimdata.getCimInst()));
//		ObjectInputStream oi = new ObjectInputStream(new ByteArrayInputStream(cimdata.getCimInst()));
//		CimData cd = (CimData)oi.readObject();
//		System.out.println(cd.getCimClassId());
//		System.out.println(new String(cd.getCimOp()));
//		System.out.println(new String(cd.getCimInst()));
		
//		ByteArrayOutputStream baos = new ByteArrayOutputStream();
//		ObjectOutputStream oos = new ObjectOutputStream(baos);
//		oos.writeObject(cimdata);
//		oos.flush();
//		baos.flush();
//		byte[] bytes = baos.toByteArray();
//		baos.close();
//		oos.close();
//		cimdata.setCimInst(bytes);
//		System.out.println( dao.updateBusinessObjs(false, cimdata) );
		System.out.println("耗时：" + (System.currentTimeMillis() - start) + " ms");
```
### #支持数据库类型： ###
DB2、Postgresql、Oracle、MS-SqlServer、MySql、H2Database、Derby、HSQL、Firebird、
Interbase、Informix、Ingres (9,10)、Unisys 2200 Relational Database (RDMS)、TimesTen 5.1

### #支持的主键生成器： ###
assigend、uuid、uuid.hex、guid、increment、sequence、select
用户可实现自己的主键生成器
实现接口org.uorm.dao.id.IdentifierGenerator。
并把ORM对应类的keyGenerator设置为实现的类全名例：org.uorm.dao.id.UUIDGenerator

## Dependency jar(依赖包) ##
只有一个依赖包 commons-logging.jar ， 只是为了日志输出。

## history ##
uorm version 1.0.1发布，修正ORM类中有BigInteger类型报错的BUG。