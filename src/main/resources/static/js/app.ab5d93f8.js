(function(t){function e(e){for(var i,r,c=e[0],o=e[1],l=e[2],d=0,u=[];d<c.length;d++)r=c[d],Object.prototype.hasOwnProperty.call(s,r)&&s[r]&&u.push(s[r][0]),s[r]=0;for(i in o)Object.prototype.hasOwnProperty.call(o,i)&&(t[i]=o[i]);p&&p(e);while(u.length)u.shift()();return n.push.apply(n,l||[]),a()}function a(){for(var t,e=0;e<n.length;e++){for(var a=n[e],i=!0,c=1;c<a.length;c++){var o=a[c];0!==s[o]&&(i=!1)}i&&(n.splice(e--,1),t=r(r.s=a[0]))}return t}var i={},s={app:0},n=[];function r(e){if(i[e])return i[e].exports;var a=i[e]={i:e,l:!1,exports:{}};return t[e].call(a.exports,a,a.exports,r),a.l=!0,a.exports}r.m=t,r.c=i,r.d=function(t,e,a){r.o(t,e)||Object.defineProperty(t,e,{enumerable:!0,get:a})},r.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})},r.t=function(t,e){if(1&e&&(t=r(t)),8&e)return t;if(4&e&&"object"===typeof t&&t&&t.__esModule)return t;var a=Object.create(null);if(r.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:t}),2&e&&"string"!=typeof t)for(var i in t)r.d(a,i,function(e){return t[e]}.bind(null,i));return a},r.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return r.d(e,"a",e),e},r.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)},r.p="";var c=window["webpackJsonp"]=window["webpackJsonp"]||[],o=c.push.bind(c);c.push=e,c=c.slice();for(var l=0;l<c.length;l++)e(c[l]);var p=o;n.push([0,"chunk-vendors"]),a()})({0:function(t,e,a){t.exports=a("56d7")},"0508":function(t,e,a){},"06cf":function(t,e,a){},"13ab":function(t,e,a){"use strict";var i=a("d68c"),s=a.n(i);s.a},"25a3":function(t,e,a){"use strict";var i=a("0508"),s=a.n(i);s.a},"32c0":function(t,e,a){},"56d7":function(t,e,a){"use strict";a.r(e);a("e260"),a("e6cf"),a("cca6"),a("a79d");var i=a("2b0e"),s=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{attrs:{id:"app"}},[a("keep-alive",[a("router-view")],1),a("van-tabbar",{attrs:{route:""}},[a("van-tabbar-item",{attrs:{replace:"",to:"/me",icon:"home-o"}},[t._v(" 个人信息 ")]),a("van-tabbar-item",{attrs:{replace:"",to:"/experience",icon:"apps-o"}},[t._v(" 项目介绍 ")])],1)],1)},n=[],r=(a("6f20"),a("2877")),c={},o=Object(r["a"])(c,s,n,!1,null,"8616734e",null),l=o.exports,p=a("8c4f"),d=a("b970"),u=(a("157a"),a("343b")),m=a("28a2"),v=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"userInfo"})},f=[],_={name:"UserInfo",data:function(){return{activeName:"1"}}},g=_,h=(a("25a3"),Object(r["a"])(g,v,f,!1,null,"4a6204ce",null)),y=h.exports,b=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"experience"},[t._l(t.listData,(function(e,i){return a("van-panel",{key:i,class:["my-panel",i%2==0?"card-green":"card-blue"],attrs:{title:e.title,desc:e.desc},on:{click:function(a){return t.changeShow(e)}}},[a("van-row",{staticClass:"my-van-row",attrs:{gutter:"8"}},t._l(e.tag,(function(e,i){return a("van-col",{key:i},[a("van-tag",{attrs:{round:"",color:t.colorList[i]}},[t._v(t._s(e))])],1)})),1)],1)})),a("van-action-sheet",{staticClass:"my-action-sheet",attrs:{title:t.dataItem.title},model:{value:t.show,callback:function(e){t.show=e},expression:"show"}},[a("div",{staticClass:"content"},[a("van-row",{staticClass:"my-time-company",attrs:{gutter:"10"}},[a("van-col",{attrs:{span:"9"}},[t._v(" "+t._s(t.dataItem.project_time)+" ")]),a("van-col",{attrs:{span:"2"}}),a("van-col",{attrs:{span:"12"}},[t._v(t._s(t.dataItem.company))])],1),t.dataItem.project_img?a("van-row",[a("img",{staticClass:"city-img",attrs:{src:t.dataItem.img_url},on:{click:function(e){return t.amplificationImg(t.dataItem.img_url)}}})]):t._e(),a("van-collapse",{attrs:{accordion:""},model:{value:t.activeName,callback:function(e){t.activeName=e},expression:"activeName"}},[t.dataItem.project_desc?a("van-collapse-item",{attrs:{name:"1"},scopedSlots:t._u([{key:"title",fn:function(){return[a("div",[a("van-tag",{attrs:{mark:"",type:"primary"}},[t._v("项目描述")])],1)]},proxy:!0}],null,!1,836333614)},[a("div",{staticClass:"my-text-space"},[t._v(" "+t._s(t.dataItem.project_desc)+" ")])]):t._e(),t.dataItem.project_module?a("van-collapse-item",{attrs:{name:"2"},scopedSlots:t._u([{key:"title",fn:function(){return[a("div",[a("van-tag",{attrs:{mark:"",color:"#7232dd"}},[t._v("功能模块")])],1)]},proxy:!0}],null,!1,4214835100)},[a("div",{staticClass:"my-text-space"},[t._v(" "+t._s(t.dataItem.project_module)+" ")])]):t._e(),a("van-collapse-item",{attrs:{name:"3"},scopedSlots:t._u([{key:"title",fn:function(){return[a("div",[a("van-tag",{attrs:{mark:"",type:"success"}},[t._v("项目职责")])],1)]},proxy:!0}])},[a("div",{staticClass:"my-text-space"},[t._v(" "+t._s(t.dataItem.project_responsibilities)+" ")])]),t.dataItem.project_skill_desc?a("van-collapse-item",{attrs:{name:"4"},scopedSlots:t._u([{key:"title",fn:function(){return[a("div",[a("van-tag",{attrs:{mark:"",type:"warning"}},[t._v("技术要点")])],1)]},proxy:!0}],null,!1,100464343)},[a("div",{staticClass:"my-text-space"},[t._v(" "+t._s(t.dataItem.project_skill_desc)+" ")])]):t._e()],1)],1)])],2)},E=[],k=[{title:"四川精准服务系统",company:"德生科技股份有限公司",project_time:"2019.02-2019.03",project_desc:"精准服务系统是公司从产品提供商向产品+运营服务商转变的标志性产品，通过德生精准服务系统的呼叫、短信等功能，支持人社公众服务业务，提高公众满意度。",project_module:"主线功能有智能客服+人工坐席服务、待遇发放短信通知。实现精准社保卡信息客服服务。",project_responsibilities:"负责阿里云短信接口的开发，单条、批量发送、处理短信上行回执；在接口的基础上实现待遇发放短信的提醒功能。",project_skill_desc:"通过线程池异步方式批量发送短信下行通知，提升系统的响应和吞吐量。",desc:"查看详情",tag:["springboot","JPA","Oracle","Redis","线程池"],details:"详情"},{title:"陕西省人社一体化项目-补换卡",company:"德生科技股份有限公司",project_time:"2019.04-2019.07",project_desc:"为了陕西各个银行网点方便社保卡的补换卡办理、记录发卡数据、制卡数据大屏的展示。还包含后台管理部分：用户信息管理、区域管理、机构管理、设备管理、预制卡管理。",project_module:"桌面制卡机制卡、pc端对发卡记录的管理、自助终端制卡业务、数据大屏统计。",project_responsibilities:"负责整个 pc 端后台开发（设备认证、卡信息验证、制卡、数据回盘）以及后台管理：用户信息管理、区域管理、机构管理、设备管理、预制卡管理，后台整体 框架 SSM+webservice，接口的调用采用DES对称加密算法，对请求参数的加解密。一体化项目采用多个项目模块，前后端分离， 请求统一经过 Nginx转发到后端，每次请求的头部通过JWT的token的形式验证接口的合法性；系统采用 AOP 动态切换多个数据源。对于中间临时数据我用Redis进行缓存。",project_skill_desc:"该项目采用分布式负载均衡的部署方式。提升系统的性能和可用性。",desc:"查看详情",tag:["SSM","webservice","DES加解密","Nginx负载均衡","jwt-token"],details:"详情"},{title:"运营城市服务分布图",company:"德生科技股份有限公司",project_time:"2019.08-2019.08",project_desc:"以地图数据大屏的方式展示公司的业务运营范围和运营的业务。外网地址：http://114.67.49.72:21480/map.html",project_module:"统计各个省、市所运营的业务，例如：自助查询服务,社保卡数据采集发行服务，社保卡数据采集发行，自助补换卡服务,缴费服务,电商扶贫服务。",project_responsibilities:"通过财务给来的Excel数据，后台编写文件上传接口，然后统计地图的业务数据。",project_skill_desc:"该项目用到文件上传和统计类型的SQL编写。",project_img:!0,img_url:"http://images.zhifa.tech/%E5%9F%8E%E5%B8%82%E5%88%86%E5%B8%83%E5%9B%BE.png",desc:"查看详情",tag:["springboot","jenkins","docker","Echart"],details:"详情"},{title:"德生城市中台项目-人力资源产品",company:"德生科技股份有限公司",project_time:"2019.08-2020.02",project_desc:"安徽芜湖人力资源的产品需求，结合社保卡业务对蓝领人员进行精准就业，管理后台部分为人力资源运营平台，人才库主要对求职人才进行面试的记录、通知等。企业用工主要维护招聘的企业信息，结合企业信息匹配人才。小程序端（云社聘），可以发布一些职位和招聘公告、企业注册找人才。",project_module:"pc端：也就是：人力资源运营平台，包括人才库（我的人才库、备用人才库、收藏的人才）、企业用工（企业-人才的匹配）、人才找工作、公司匹配人才。小程序端（云社聘）：招聘会信息、惠民政策、惠企政策、求职者信息登记、人才找职位、企业匹配，推荐人才、培训信息。",project_responsibilities:"编写搜索微服务公共组件。我采用的是elasticsearch搜索引擎作为基础搜索服务组件，ik中文分词器作为插件。目前完成关于政府类的政策搜索、根据标题或者内容作为筛选条件，政策类型（个人、企业）作为过滤条件；C端用户搜索职位，搜索职位或者公司查询对应的职位信息，然后根据多条件（地点范围、职位类型、薪资范围等）过滤查询结果；帮你推荐功能，根据用户填写的个性化字段，把这些作为筛选条件到es上面匹配信息。由于是公共层服务为了解耦其他服务，本搜索服务都对外提供全量同步、增量同步、删除接口。只要其他服务以restful风格的请求调用即可。",project_skill_desc:"基于springcloud的微服务架构，注册中心使用阿里的nacos（集成注册中心、分布式配置中心）；服务网关使用spring的gateway（使用基于netty异步io）。",desc:"查看详情    小程序已上线，搜索《云社聘》",tag:["springcloud","分布式架构","jenkins持续集成","高可用mysql","seata分布式事务","elasticsearch"],details:"详情"},{title:"读写分离，高性能、高可用mysql集群",company:"德生科技股份有限公司",project_time:"2019.08-2020.02",project_responsibilities:"搭建读写分离+主备热切+mycat数据库中间件的高可用mysql。考虑到中台未来的用户量大，并发要求高。我搭建了双主双从架构模式的mysql数据库，双主互为主从。底层通过监听binlog日志文件的形式实现数据的同步，为了解决同步时延带来的查询问题，在服务层添加事务（mysql事务的默认特性：可重复读），让请求打到主库上面。利用mycat数据库中间件屏蔽数据库集群的信息，所有请求统一由中间件转发处理。",desc:"查看详情 ",tag:["高性能","高可用","主备热切mysql","数据库中间件"],details:"详情"},{title:"seata实现分布式事务强一致性",company:"德生科技股份有限公司",project_time:"2019.08-2020.02",project_responsibilities:"由于系统采用springcloud分布式架构微服务，各个服务相互独立，数据库也相应独立分离。基于业务需求，需要在两个数据库之间实现数据操作的强一致性（原子性），所以我基于Alibaba提供的组件搭建了seata分布式事务强一致性组件，多个微服务的数据源注册到统一的seata服务（事务协调者），由调用方（事务发起者统一发起全局事务）事务在多个微服务（参与者）中传播，最后采取二段提交协议的方式达到事务强一致性。",desc:"查看详情",tag:["springcloud分布式架构","多数据源","事务强一致性"],details:"详情"},{title:"ELK日志收集",company:"德生科技股份有限公司",project_time:"2019.08-2020.02",project_responsibilities:"搭建日志收集、分析框架ELK，在每个微服务的日志配置文件中配置好logstash信息，通过它收集每个微服务的日志信息，我设置按照日期分包，服务名分文件的形式，一份写到elasticsearch上面，一份保存在服务器本地做日志归档；然后用kibana监控每个微服务输出到es上面的信息。通过kibana组件实时监控各个微服务的运行状态。",desc:"查看详情",tag:["elasticsearch","logstash","kibana"],details:"详情"},{title:"广州市排水设施巡检系统",company:"奥格智能科技有限公司",project_time:"2020.03-2020.05",project_desc:"该系统面向的用户为广州市各区的排水公司，大模块包括：巡检巡查（排水设施巡检、巡检日志、巡检轨迹、养护计划审核）、数据上报（排水口管理、内涝管理、水质管理、管网运行图、城镇污水处理）、专栏管理、排水户管理（门派查询、导出、问题处理）",project_module:"排水监测站和水务局提出污水处理厂污泥处理上报和统计，要求维管单位在对污水处理厂对污泥处理情况上报，系统提供报表导出功能进行数据导出，此需求涉及PC端功能和报表开发，报表均提供时间戳功能，可以统计时间段的数据。",project_responsibilities:"合并排水设施巡检的第三方（广州市排水公司、黄埔科学城排水公司）数据，并展示到巡检动态模块；编写、处理城镇污水处理模块的数据，导入各区的污水、污泥信息，并统计报表信息;对广州市各区的排水公司污水、污泥数据的增删改查。广州市污泥干化情况统计、广州市干化污泥焚烧处置情况统计。",project_skill_desc:"",project_img:!0,img_url:"http://images.zhifa.tech/%E5%B9%BF%E5%B7%9E%E6%8E%92%E6%B0%B4%E5%B7%A1%E6%A3%80pc%281%29.png",desc:"查看详情",tag:["ssh","jdbcTemplate","oracle 11g","系统数据维护","数据统计报表"],details:"详情"}],w=k,j={name:"Experience",mounted:function(){this.screenWidth=window.screen.width},data:function(){return{city_img:"http://images.zhifa.tech/%E5%9F%8E%E5%B8%82%E5%88%86%E5%B8%83%E5%9B%BE.png",screenWidth:"",activeName:"1",show:!1,colorList:["#8bd3f2","#b884dd","#986add","#687fdd","#655ADD","#29f585","#f175f5"],listData:w,dataItem:{}}},methods:{changeShow:function(t){this.show=!this.show,this.show&&(this.dataItem=t,t.project_desc?this.activeName="1":this.activeName="3")},amplificationImg:function(t){Object(m["a"])({images:[t],closeable:!0})}}},B=j,x=(a("13ab"),Object(r["a"])(B,b,E,!1,null,"597346b3",null)),S=x.exports,C=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"me"},[a("div",{staticClass:"me-swipe"},[a("van-swipe",{staticClass:"my-swipe",attrs:{autoplay:3e3,"indicator-color":"white"}},t._l(t.images,(function(e,i){return a("van-swipe-item",{key:i,on:{click:function(e){return t.openSwipe(i)}}},[a("img",{directives:[{name:"lazy",rawName:"v-lazy",value:e,expression:"image"}]})])})),1)],1),a("van-notice-bar",{attrs:{color:"#1989fa",background:"#ecf9ff",mode:"closeable","left-icon":"volume-o"}},[t._v(" "+t._s(t.notice.msg)+" ")]),a("van-divider"),a("div",[a("van-row",[a("van-col",{attrs:{span:"6"}},[a("van-image",{staticClass:"my-head-img",attrs:{round:"",width:"4.5rem",height:"4.5rem",fit:"cover",src:t.lzf.my_head_img}})],1),a("van-col",{attrs:{span:"9"}},[a("h4",[t._v(t._s(t.lzf.school))])]),a("van-col",{attrs:{span:"9"}},[a("h4",[t._v(t._s(t.lzf.profession))])])],1)],1),a("van-divider"),a("div",[a("van-collapse",{attrs:{accordion:""},model:{value:t.activeName,callback:function(e){t.activeName=e},expression:"activeName"}},t._l(t.listData,(function(e,i){return a("van-collapse-item",{key:i,attrs:{title:e.title,name:i,icon:e.icon}},t._l(e.cardData,(function(e,i){return a("div",{key:i,class:["card",i%2==0?"card-green":"card-blue"]},[e.skill?a("div",{staticClass:"my-skill"},[t._v(" "+t._s(e.skill)+" ")]):t._e(),e.enterprise?a("div",{},[a("van-row",{attrs:{type:"flex",justify:"center"}},[a("van-col",{attrs:{span:"24"}},[a("van-divider",{style:{color:"#1989fa",borderColor:"#1989fa",padding:"0 16px"}},[t._v(" "+t._s(e.enterprise)+" ")])],1)],1),t._l(e.contents,(function(i,s){return e.contents?a("div",{key:s,staticClass:"my-skill"},[t._v(" "+t._s(i.work)+" ")]):t._e()}))],2):a("van-row",{attrs:{gutter:"1"}},[a("van-col",{attrs:{span:"6"}},[t._v(t._s(e.time))]),a("van-col",{attrs:{span:"11"}},[t._v(t._s(e.type))]),a("van-col",{attrs:{span:"7"}},[t._v(t._s(e.award))])],1)],1)})),0)})),1)],1)],1)},A=[],I=(a("96cf"),a("1da1")),O={name:"Me",mounted:function(){this.getUserList()},methods:{getUserList:function(){return Object(I["a"])(regeneratorRuntime.mark((function t(){return regeneratorRuntime.wrap((function(t){while(1)switch(t.prev=t.next){case 0:case"end":return t.stop()}}),t)})))()},openSwipe:function(t){Object(m["a"])({images:this.images,closeable:!0,startPosition:t})}},data:function(){return{lzf:{school:"广东海洋大学",profession:"软件工程",my_head_img:"http://images.zhifa.tech/me.jpg"},notice:{msg:"仅作个人开发测试使用..."},listData:[{title:"证书奖项",icon:"award",cardData:[{time:"2018-11",type:"国家软考",award:"系统架构设计师"},{time:"2018-05",type:"第九届蓝桥杯算法大赛",award:"国赛三等奖"},{time:"2018-04",type:"第九届蓝桥杯算法大赛",award:"省赛一等奖"},{time:"2017-2018",type:"校奖学金",award:"三等奖"},{time:"2017-11",type:"国家软考",award:"软件设计师"},{time:"2017-05",type:"第八届蓝桥杯算法大赛",award:"国赛三等奖"},{time:"2017-04",type:"第八届蓝桥杯算法大赛",award:"省赛一等奖"},{time:"2016-12",type:"大学英语",award:"CET4"}]},{title:"个人技能",icon:"column",cardData:[{skill:"熟练使用Java语言进行面向对象程序设计以及常用的Java API，包括集合框架、反射等。"},{skill:"熟悉常用的数据结构, 算法知识。能手写一些深度优先搜索算法(八皇后、马踏棋盘、走迷宫)。"},{skill:"理解多线程并发下web开发注意事项以及线程安全问题，使用多线程异步技术解决项目中请求快速响应问题。"},{skill:"对Spring的IoC容器和AOP原理有了解，熟练的运用Spring框架管理各种Web组件及其依赖关系，熟练的使用Spring进行事务、日志、安全性等的管理，有使用Spring MVC作为表示层技术以及使用Spring提供的持久化支持进行Web项目开发的经验，熟悉Spring对其他框架的整合。"},{skill:"熟悉常用的关系型数据库产品（MySQL、Oracle），熟练的使用SQL进行数据库编程，编写视图，能手动搭建mysql读写分离、主从架构、了解数据索引机制，锁机制，SQL优化。"},{skill:"能搭建分布式缓存 Redis 集群（通过集群管理工具搭建官方在 3.0 版本推出的一套分布式存储方案）。"},{skill:"熟练使用远程过程调用框架webservice、熟悉springboot等开源框架技术，熟练使用redis缓存（分布式session和分布式锁）。"},{skill:"了解分布式结构体系、SOA架构、Dubbo+Zookeeper、Spring Cloud/Alibaba技术栈以及Eureka、nacos注册中心、Feign客户端负载均衡组件、Hystrix熔断器、Config分布式统一配置中心、Zuul、spring的gateway服务网关。"},{skill:"能手写自定义springboot-starter组件，熟悉springboot加载组件过程，可以根据需要手动封装基础组件。"},{skill:"熟悉elasticsearch搜索引擎，以及常用字段搜索和地图GEO的范围搜索、关键词模糊匹配、分词查询，目前应用改技术编写搜索业务到实际项目中。"},{skill:"能搭建Jenkins+Docker用于项目的CI/CD做持续集成、部署，通过Docker镜像的方式实现自动化流程来检查代码并部署到新环境。"},{skill:"运用设计原则和设计模式对项目进行架构设计、封装服务调用中间层，提高代码重用性，加强代码解耦能力。"}]},{title:"工作经历",icon:"more",cardData:[{enterprise:"德生科技股份有限公司",department:"大数据项目组",position:"java开发工程师",contents:[{work:"1.负责公司一体化产品的后台开发、 pc端社保卡业务开发。"},{work:"2.编写一些公司通用服务，如短信服务、搭建一些分布式应用系统的环境。"},{work:"3.为公司多个展示大屏编写数据处理逻辑，提供接口给财务直接上传文件展示数据。"},{work:"4.优化公司现有系统的性能、实现高可用，在项目中对代码采用设计模式，对代码结构进行抽象，遵循软件设计原则，注重里氏替换原则，其核心为了调用的解耦。"},{work:"5.与开发经理，产品运营，前端，UI，测试人员共同参与需求分析，以及需求评审工作。"},{work:"6.负责从0到1搭建微服务架构项目（人力资源产品），参与项目搭建和各大应用组件，工具的封装。"}]},{enterprise:"奥格智能科技有限公司",department:"智慧水务二部",position:"java开发工程师",contents:[{work:"1.负责广州市排水设施巡检系统数据维护和更新迭代功能，合并其他城市或地区的排水巡检记录数据。"},{work:"2.编写、处理广州市各区的排水公司的排水设施巡检信息系统的数据，并统计报表信息。"},{work:"3.优化系统性能，提升用户交互体验，重构，优化项目代码结构。"},{work:"4.与产品经理，设计师，安卓APP开发工作人员协同工作，负责pc端，安卓手机APP端项目接口开发。"}]}]}],activeName:"1",images:["http://images.zhifa.tech/%E5%9F%8E%E5%B8%82%E5%88%86%E5%B8%83%E5%9B%BE.png","http://images.zhifa.tech/%E4%BA%91%E7%A4%BE%E8%81%983%E5%90%881.jpg","http://images.zhifa.tech/%E5%B9%BF%E5%B7%9E%E6%8E%92%E6%B0%B4%E5%B7%A1%E6%A3%80pc%281%29.png","http://images.zhifa.tech/%E6%B1%A1%E6%B3%A5%E5%B9%B2%E5%8C%96%E6%83%85%E5%86%B5.png","http://images.zhifa.tech/%E5%B9%B2%E5%8C%96%E6%B1%A1%E6%B3%A5%E7%84%9A%E7%83%A7%E5%A4%84%E7%BD%AE%E7%BB%9F%E8%AE%A1.png"]}}},D=O,P=(a("ae3c"),Object(r["a"])(D,C,A,!1,null,"56d44060",null)),z=P.exports,N=a("2ca7"),L=a.n(N);a("46c6");i["default"].use(L.a),i["default"].use(u["a"]),i["default"].use(m["a"]),i["default"].use(p["a"]),i["default"].use(d["a"]);var M=[{path:"/",name:"UserInfo",component:y,redirect:"/me"},{path:"/experience",name:"Experience",component:S},{path:"/me",name:"Me",component:z}],q=new p["a"]({routes:M}),F=q,J=a("2f62");i["default"].use(J["a"]);var R=new J["a"].Store({state:{},mutations:{},actions:{},modules:{}}),T=a("bc3a"),U=a.n(T);i["default"].prototype.$http=U.a,U.a.defaults.baseURL="/api/",i["default"].config.productionTip=!1,new i["default"]({router:F,store:R,render:function(t){return t(l)}}).$mount("#app")},"6f20":function(t,e,a){"use strict";var i=a("32c0"),s=a.n(i);s.a},ae3c:function(t,e,a){"use strict";var i=a("06cf"),s=a.n(i);s.a},d68c:function(t,e,a){}});