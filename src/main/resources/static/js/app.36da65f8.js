(function(e){function t(t){for(var i,s,c=t[0],o=t[1],l=t[2],m=0,d=[];m<c.length;m++)s=c[m],Object.prototype.hasOwnProperty.call(n,s)&&n[s]&&d.push(n[s][0]),n[s]=0;for(i in o)Object.prototype.hasOwnProperty.call(o,i)&&(e[i]=o[i]);p&&p(t);while(d.length)d.shift()();return r.push.apply(r,l||[]),a()}function a(){for(var e,t=0;t<r.length;t++){for(var a=r[t],i=!0,c=1;c<a.length;c++){var o=a[c];0!==n[o]&&(i=!1)}i&&(r.splice(t--,1),e=s(s.s=a[0]))}return e}var i={},n={app:0},r=[];function s(t){if(i[t])return i[t].exports;var a=i[t]={i:t,l:!1,exports:{}};return e[t].call(a.exports,a,a.exports,s),a.l=!0,a.exports}s.m=e,s.c=i,s.d=function(e,t,a){s.o(e,t)||Object.defineProperty(e,t,{enumerable:!0,get:a})},s.r=function(e){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(e,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(e,"__esModule",{value:!0})},s.t=function(e,t){if(1&t&&(e=s(e)),8&t)return e;if(4&t&&"object"===typeof e&&e&&e.__esModule)return e;var a=Object.create(null);if(s.r(a),Object.defineProperty(a,"default",{enumerable:!0,value:e}),2&t&&"string"!=typeof e)for(var i in e)s.d(a,i,function(t){return e[t]}.bind(null,i));return a},s.n=function(e){var t=e&&e.__esModule?function(){return e["default"]}:function(){return e};return s.d(t,"a",t),t},s.o=function(e,t){return Object.prototype.hasOwnProperty.call(e,t)},s.p="";var c=window["webpackJsonp"]=window["webpackJsonp"]||[],o=c.push.bind(c);c.push=t,c=c.slice();for(var l=0;l<c.length;l++)t(c[l]);var p=o;r.push([0,"chunk-vendors"]),a()})({0:function(e,t,a){e.exports=a("56d7")},"0508":function(e,t,a){},"13ab":function(e,t,a){"use strict";var i=a("a36b"),n=a.n(i);n.a},2395:function(e,t,a){},"25a3":function(e,t,a){"use strict";var i=a("0508"),n=a.n(i);n.a},"4e59":function(e,t,a){},"56d7":function(e,t,a){"use strict";a.r(t);a("e260"),a("e6cf"),a("cca6"),a("a79d");var i=a("2b0e"),n=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{attrs:{id:"app"}},[a("keep-alive",[a("router-view")],1)],1)},r=[],s=(a("7c55"),a("2877")),c={},o=Object(s["a"])(c,n,r,!1,null,null,null),l=o.exports,p=a("8c4f"),m=a("343b"),d=a("28a2"),u=a("b970"),g=a("8f80"),f=(a("157a"),function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"userInfo"})}),v=[],h={name:"UserInfo",data:function(){return{activeName:"1"}}},_=h,b=(a("25a3"),Object(s["a"])(_,f,v,!1,null,"4a6204ce",null)),w=b.exports,y=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"experience"},[e._l(e.listData,(function(t,i){return a("van-panel",{key:i,class:["my-panel",i%2==0?"card-green":"card-blue"],attrs:{title:t.title,desc:t.desc},on:{click:function(a){return e.changeShow(t)}}},[a("van-row",{staticClass:"my-van-row",attrs:{gutter:"8"}},e._l(t.tag,(function(t,i){return a("van-col",{key:i},[a("van-tag",{attrs:{round:"",color:e.colorList[i]}},[e._v(e._s(t))])],1)})),1)],1)})),a("van-action-sheet",{staticClass:"my-action-sheet",attrs:{title:e.dataItem.title},model:{value:e.show,callback:function(t){e.show=t},expression:"show"}},[a("div",{staticClass:"content"},[a("van-row",{staticClass:"my-time-company",attrs:{gutter:"10"}},[a("van-col",{attrs:{span:"9"}},[e._v(" "+e._s(e.dataItem.project_time)+" ")]),a("van-col",{attrs:{span:"2"}}),a("van-col",{attrs:{span:"12"}},[e._v(e._s(e.dataItem.company))])],1),e.dataItem.project_img?a("van-row",[a("img",{staticClass:"city-img",attrs:{src:e.dataItem.img_url},on:{click:function(t){return e.amplificationImg(e.dataItem.img_url)}}})]):e._e(),a("van-collapse",{attrs:{accordion:""},model:{value:e.activeName,callback:function(t){e.activeName=t},expression:"activeName"}},[e.dataItem.project_desc?a("van-collapse-item",{attrs:{name:"1"},scopedSlots:e._u([{key:"title",fn:function(){return[a("div",[a("van-tag",{attrs:{mark:"",type:"primary"}},[e._v("项目描述")])],1)]},proxy:!0}],null,!1,836333614)},[a("div",{staticClass:"my-text-space"},[e._v(" "+e._s(e.dataItem.project_desc)+" ")])]):e._e(),e.dataItem.project_module?a("van-collapse-item",{attrs:{name:"2"},scopedSlots:e._u([{key:"title",fn:function(){return[a("div",[a("van-tag",{attrs:{mark:"",color:"#7232dd"}},[e._v("功能模块")])],1)]},proxy:!0}],null,!1,4214835100)},[a("div",{staticClass:"my-text-space"},[e._v(" "+e._s(e.dataItem.project_module)+" ")])]):e._e(),a("van-collapse-item",{attrs:{name:"3"},scopedSlots:e._u([{key:"title",fn:function(){return[a("div",[a("van-tag",{attrs:{mark:"",type:"success"}},[e._v("项目职责")])],1)]},proxy:!0}])},[a("div",{staticClass:"my-text-space"},[e._v(" "+e._s(e.dataItem.project_responsibilities)+" ")])]),e.dataItem.project_skill_desc?a("van-collapse-item",{attrs:{name:"4"},scopedSlots:e._u([{key:"title",fn:function(){return[a("div",[a("van-tag",{attrs:{mark:"",type:"warning"}},[e._v("技术要点")])],1)]},proxy:!0}],null,!1,100464343)},[a("div",{staticClass:"my-text-space"},[e._v(" "+e._s(e.dataItem.project_skill_desc)+" ")])]):e._e()],1)],1)])],2)},E=[],k=[{title:"四川精准服务系统",company:"德生科技股份有限公司",project_time:"2019.02-2019.03",project_desc:"精准服务系统是公司从产品提供商向产品+运营服务商转变的标志性产品，通过德生精准服务系统的呼叫、短信等功能，支持人社公众服务业务，提高公众满意度。",project_module:"主线功能有智能客服+人工坐席服务、待遇发放短信通知。实现精准社保卡信息客服服务。",project_responsibilities:"负责阿里云短信接口的开发，单条、批量发送、处理短信上行回执；在接口的基础上实现待遇发放短信的提醒功能。",project_skill_desc:"通过线程池异步方式批量发送短信下行通知，提升系统的响应和吞吐量。",desc:"查看详情",tag:["springboot","JPA","Oracle","Redis","线程池"],details:"详情"},{title:"陕西省人社一体化项目-补换卡",company:"德生科技股份有限公司",project_time:"2019.04-2019.07",project_desc:"为了陕西各个银行网点方便社保卡的补换卡办理、记录发卡数据、制卡数据大屏的展示。还包含后台管理部分：用户信息管理、区域管理、机构管理、设备管理、预制卡管理。",project_module:"桌面制卡机制卡、pc端对发卡记录的管理、自助终端制卡业务、数据大屏统计。",project_responsibilities:"负责整个 pc 端后台开发（设备认证、卡信息验证、制卡、数据回盘）以及后台管理：用户信息管理、区域管理、机构管理、设备管理、预制卡管理，后台整体 框架 SSM+webservice，接口的调用采用DES对称加密算法，对请求参数的加解密。一体化项目采用多个项目模块，前后端分离， 请求统一经过 Nginx转发到后端，每次请求的头部通过JWT的token的形式验证接口的合法性；系统采用 AOP 动态切换多个数据源。对于中间临时数据我用Redis进行缓存。",project_skill_desc:"该项目采用分布式负载均衡的部署方式。提升系统的性能和可用性。",desc:"查看详情",tag:["SSM","webservice","DES加解密","Nginx负载均衡","jwt-token"],details:"详情"},{title:"运营城市服务分布图",company:"德生科技股份有限公司",project_time:"2019.08-2019.08",project_desc:"以地图数据大屏的方式展示公司的业务运营范围和运营的业务。外网地址：http://114.67.49.72:21480/map.html",project_module:"统计各个省、市所运营的业务，例如：自助查询服务,社保卡数据采集发行服务，社保卡数据采集发行，自助补换卡服务,缴费服务,电商扶贫服务。",project_responsibilities:"通过财务给来的Excel数据，后台编写文件上传接口，然后统计地图的业务数据。",project_skill_desc:"该项目用到文件上传和统计类型的SQL编写。",project_img:!0,img_url:"http://images.zhifa.tech/%E5%9F%8E%E5%B8%82%E5%88%86%E5%B8%83%E5%9B%BE.png",desc:"查看详情",tag:["springboot","jenkins","docker","Echart"],details:"详情"},{title:"德生城市中台项目-人力资源产品",company:"德生科技股份有限公司",project_time:"2019.08-2020.02",project_desc:"安徽芜湖人力资源的产品需求，结合社保卡业务对蓝领人员进行精准就业，管理后台部分为人力资源运营平台，人才库主要对求职人才进行面试的记录、通知等。企业用工主要维护招聘的企业信息，结合企业信息匹配人才。小程序端（云社聘），可以发布一些职位和招聘公告、企业注册找人才。",project_module:"pc端：也就是：人力资源运营平台，包括人才库（我的人才库、备用人才库、收藏的人才）、企业用工（企业-人才的匹配）、人才找工作、公司匹配人才。小程序端（云社聘）：招聘会信息、惠民政策、惠企政策、求职者信息登记、人才找职位、企业匹配，推荐人才、培训信息。",project_responsibilities:"编写搜索微服务公共组件。我采用的是elasticsearch搜索引擎作为基础搜索服务组件，ik中文分词器作为插件。目前完成关于政府类的政策搜索、根据标题或者内容作为筛选条件，政策类型（个人、企业）作为过滤条件；C端用户搜索职位，搜索职位或者公司查询对应的职位信息，然后根据多条件（地点范围、职位类型、薪资范围等）过滤查询结果；帮你推荐功能，根据用户填写的个性化字段，把这些作为筛选条件到es上面匹配信息。由于是公共层服务为了解耦其他服务，本搜索服务都对外提供全量同步、增量同步、删除接口。只要其他服务以restful风格的请求调用即可。",project_skill_desc:"基于springcloud的微服务架构，注册中心使用阿里的nacos（集成注册中心、分布式配置中心）；服务网关使用spring的gateway（使用基于netty异步io）。",desc:"查看详情    小程序已上线，搜索《云社聘》",tag:["springcloud","分布式架构","jenkins持续集成","高可用mysql","seata分布式事务","elasticsearch"],details:"详情"},{title:"读写分离，高性能、高可用mysql集群",company:"德生科技股份有限公司",project_time:"2019.08-2020.02",project_responsibilities:"搭建读写分离+主备热切+mycat数据库中间件的高可用mysql。考虑到中台未来的用户量大，并发要求高。我搭建了双主双从架构模式的mysql数据库，双主互为主从。底层通过监听binlog日志文件的形式实现数据的同步，为了解决同步时延带来的查询问题，在服务层添加事务（mysql事务的默认特性：可重复读），让请求打到主库上面。利用mycat数据库中间件屏蔽数据库集群的信息，所有请求统一由中间件转发处理。",desc:"查看详情 ",tag:["高性能","高可用","主备热切mysql","数据库中间件"],details:"详情"},{title:"seata实现分布式事务强一致性",company:"德生科技股份有限公司",project_time:"2019.08-2020.02",project_responsibilities:"由于系统采用springcloud分布式架构微服务，各个服务相互独立，数据库也相应独立分离。基于业务需求，需要在两个数据库之间实现数据操作的强一致性（原子性），所以我基于Alibaba提供的组件搭建了seata分布式事务强一致性组件，多个微服务的数据源注册到统一的seata服务（事务协调者），由调用方（事务发起者统一发起全局事务）事务在多个微服务（参与者）中传播，最后采取二段提交协议的方式达到事务强一致性。",desc:"查看详情",tag:["springcloud分布式架构","多数据源","事务强一致性"],details:"详情"},{title:"ELK日志收集",company:"德生科技股份有限公司",project_time:"2019.08-2020.02",project_responsibilities:"搭建日志收集、分析框架ELK，在每个微服务的日志配置文件中配置好logstash信息，通过它收集每个微服务的日志信息，我设置按照日期分包，服务名分文件的形式，一份写到elasticsearch上面，一份保存在服务器本地做日志归档；然后用kibana监控每个微服务输出到es上面的信息。通过kibana组件实时监控各个微服务的运行状态。",desc:"查看详情",tag:["elasticsearch","logstash","kibana"],details:"详情"},{title:"广州市排水设施巡检系统",company:"奥格智能科技有限公司",project_time:"2020.03-2020.05",project_desc:"该系统面向的用户为广州市各区的排水公司，大模块包括：巡检巡查（排水设施巡检、巡检日志、巡检轨迹、养护计划审核）、数据上报（排水口管理、内涝管理、水质管理、管网运行图、城镇污水处理）、专栏管理、排水户管理（门派查询、导出、问题处理）",project_module:"排水监测站和水务局提出污水处理厂污泥处理上报和统计，要求维管单位在对污水处理厂对污泥处理情况上报，系统提供报表导出功能进行数据导出，此需求涉及PC端功能和报表开发，报表均提供时间戳功能，可以统计时间段的数据。",project_responsibilities:"合并排水设施巡检的第三方（广州市排水公司、黄埔科学城排水公司）数据，并展示到巡检动态模块；编写、处理城镇污水处理模块的数据，导入各区的污水、污泥信息，并统计报表信息;对广州市各区的排水公司污水、污泥数据的增删改查。广州市污泥干化情况统计、广州市干化污泥焚烧处置情况统计。",project_skill_desc:"",project_img:!0,img_url:"http://images.zhifa.tech/%E5%B9%BF%E5%B7%9E%E6%8E%92%E6%B0%B4%E5%B7%A1%E6%A3%80pc%281%29.png",desc:"查看详情",tag:["ssh","jdbcTemplate","oracle 11g","系统数据维护","数据统计报表"],details:"详情"},{title:"清远市城市水系监测及智慧排水信息化管理平台",company:"奥格智能科技有限公司",project_time:"2020.06-2020.09",project_desc:"该项目是清远市城市水系监测及智慧排水信息化管理一体化平台，包含众多模块：黑臭水体监控系统（水质整治信息、基础信息管理、河湖名录、监测信息、水环境容量计算、水质预测）；厂网河一体化业务系统（排水设施基本管理、设施问题上报处理、在线监测数据接入、运行报告上传）。项目已上线：http://awater.qyzhsl.com:8090/opus-front-sso/authentication/require",project_module:"问题上报及处置管理：1、对巡查和养护过程中所发现的每一类排水设施存在的各种问题进行上报、任务派发、过程记录、处理结果记录，对处理结果进行复核与评价；采用工作流方式驱动，分不同角色办理，可自由流转，可任务代办、转办，办理过程可加注意见与建议。2、问题统计分析，具体包括按区统计问题数量、按人统计问题数量，还包括导出统计表等功能；3、按行政区划、责任单位、上报时间周期等分类统计与查看问题上报和处理情况列表，查看上报问题在地图上分布情况。",project_responsibilities:"采用h5移动端页面的方式实现问题上报功能，项目亮点就是大文件分片上传和断点续传。核心思路：前端对文件进行分片，并且发送文件的唯一标识（文件名、类型、大小或者其他属性进行md5摘要计算可得）、分片索引（第几个分片）、分片总数、文件名称（方便合并后的文件名称）；前端用递归方式将分片传输到后台，后台判断分片索引等于分片总数就开始合并，通过流输出追加的方式合并文件。断点续传：网络波动情况下，文件传输不完整，所以前端在文件上传的时候根据文件的唯一标识查询后台，然后再确定要上传哪些分片。",project_skill_desc:"该项目采用分模块服务的方式：每个模块独立一个服务，然后都集成同一个地址的单点登录（SSO），所有请求都统一由NGINX来转发，所以对外只暴露一个地址和端口。而且根据服务访问情况，同一个服务部署多份实现服务的负载均衡。",project_img:!0,img_url:"http://images.zhifa.tech/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200904140205.png",desc:"查看详情",tag:["springboot","大文件分片上传","极速秒传和断点续传","vue element UI"],details:"详情"}],j=k,I={name:"Experience",mounted:function(){this.screenWidth=window.screen.width},data:function(){return{city_img:"http://images.zhifa.tech/%E5%9F%8E%E5%B8%82%E5%88%86%E5%B8%83%E5%9B%BE.png",screenWidth:"",activeName:"1",show:!1,colorList:["#8bd3f2","#b884dd","#986add","#687fdd","#655ADD","#29f585","#f175f5"],listData:j,dataItem:{}}},methods:{changeShow:function(e){this.show=!this.show,this.show&&(this.dataItem=e,e.project_desc?this.activeName="1":this.activeName="3")},amplificationImg:function(e){Object(d["a"])({images:[e],closeable:!0})}}},B=I,x=(a("13ab"),Object(s["a"])(B,y,E,!1,null,"597346b3",null)),C=x.exports,A=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"me"},[a("div",{staticClass:"me-swipe"},[a("van-swipe",{staticClass:"my-swipe",attrs:{autoplay:3e3,"indicator-color":"white"}},e._l(e.images,(function(t,i){return a("van-swipe-item",{key:i,on:{click:function(t){return e.openSwipe(i)}}},[a("img",{directives:[{name:"lazy",rawName:"v-lazy",value:t,expression:"image"}]})])})),1)],1),a("van-notice-bar",{attrs:{color:"#1989fa",background:"#ecf9ff",mode:"closeable","left-icon":"volume-o"}},[e._v(" "+e._s(e.notice.msg)+" ")]),a("van-divider"),a("div",[a("van-row",[a("van-col",{attrs:{span:"6"}},[a("van-image",{staticClass:"my-head-img",attrs:{round:"",width:"4.5rem",height:"4.5rem",fit:"cover",src:e.lzf.my_head_img}})],1),a("van-col",{attrs:{span:"9"}},[a("h4",[e._v(e._s(e.lzf.school))])]),a("van-col",{attrs:{span:"9"}},[a("h4",[e._v(e._s(e.lzf.profession))])])],1)],1),a("van-divider"),a("div",[a("van-collapse",{attrs:{accordion:""},model:{value:e.activeName,callback:function(t){e.activeName=t},expression:"activeName"}},e._l(e.listData,(function(t,i){return a("van-collapse-item",{key:i,attrs:{title:t.title,name:i,icon:t.icon}},e._l(t.cardData,(function(t,i){return a("div",{key:i,class:["card",i%2==0?"card-green":"card-blue"]},[t.skill?a("div",{staticClass:"my-skill"},[e._v(" "+e._s(t.skill)+" ")]):e._e(),t.enterprise?a("div",{},[a("van-row",{attrs:{type:"flex",justify:"center"}},[a("van-col",{attrs:{span:"24"}},[a("van-divider",{style:{color:"#1989fa",borderColor:"#1989fa",padding:"0 16px"}},[e._v(" "+e._s(t.enterprise)+" ")])],1)],1),e._l(t.contents,(function(i,n){return t.contents?a("div",{key:n,staticClass:"my-skill"},[e._v(" "+e._s(i.work)+" ")]):e._e()}))],2):a("van-row",{attrs:{gutter:"1"}},[a("van-col",{attrs:{span:"6"}},[e._v(e._s(t.time))]),a("van-col",{attrs:{span:"11"}},[e._v(e._s(t.type))]),a("van-col",{attrs:{span:"7"}},[e._v(e._s(t.award))])],1)],1)})),0)})),1)],1)],1)},S=[],O=(a("96cf"),a("1da1")),z={name:"Me",mounted:function(){this.getUserList()},methods:{getUserList:function(){return Object(O["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:case"end":return e.stop()}}),e)})))()},openSwipe:function(e){Object(d["a"])({images:this.images,closeable:!0,startPosition:e})}},data:function(){return{lzf:{school:"广东海洋大学",profession:"软件工程",my_head_img:"http://images.zhifa.tech/me.jpg"},notice:{msg:"仅作个人开发测试使用..."},listData:[{title:"证书奖项",icon:"award",cardData:[{time:"2018-11",type:"国家软考",award:"系统架构设计师"},{time:"2018-05",type:"第九届蓝桥杯算法大赛",award:"国赛三等奖"},{time:"2018-04",type:"第九届蓝桥杯算法大赛",award:"省赛一等奖"},{time:"2017-2018",type:"校奖学金",award:"三等奖"},{time:"2017-11",type:"国家软考",award:"软件设计师"},{time:"2017-05",type:"第八届蓝桥杯算法大赛",award:"国赛三等奖"},{time:"2017-04",type:"第八届蓝桥杯算法大赛",award:"省赛一等奖"},{time:"2016-12",type:"大学英语",award:"CET4"}]},{title:"个人技能",icon:"column",cardData:[{skill:"熟练使用Java语言进行面向对象程序设计以及常用的Java API，包括集合框架、反射等。"},{skill:"熟悉常用的数据结构, 算法知识。能手写一些深度优先搜索算法(八皇后、马踏棋盘、走迷宫)。"},{skill:"理解多线程并发下web开发注意事项以及线程安全问题，使用多线程异步技术解决项目中请求快速响应问题。"},{skill:"对Spring的IoC容器和AOP原理有了解，熟练的运用Spring框架管理各种Web组件及其依赖关系，熟练的使用Spring进行事务、日志、安全性等的管理，有使用Spring MVC作为表示层技术以及使用Spring提供的持久化支持进行Web项目开发的经验，熟悉Spring对其他框架的整合。"},{skill:"熟悉常用的关系型数据库产品（MySQL、Oracle），熟练的使用SQL进行数据库编程，编写视图，能手动搭建mysql读写分离、主从架构、了解数据索引机制，锁机制，SQL优化。"},{skill:"能搭建分布式缓存 Redis 集群（通过集群管理工具搭建官方在 3.0 版本推出的一套分布式存储方案）。"},{skill:"熟练使用远程过程调用框架webservice、熟悉springboot等开源框架技术，熟练使用redis缓存（分布式session和分布式锁）。"},{skill:"了解分布式结构体系、SOA架构、Dubbo+Zookeeper、Spring Cloud/Alibaba技术栈以及Eureka、nacos注册中心、Feign客户端负载均衡组件、Hystrix熔断器、Config分布式统一配置中心、Zuul、spring的gateway服务网关。"},{skill:"能手写自定义springboot-starter组件，熟悉springboot加载组件过程，可以根据需要手动封装基础组件。"},{skill:"熟悉elasticsearch搜索引擎，以及常用字段搜索和地图GEO的范围搜索、关键词模糊匹配、分词查询，目前应用改技术编写搜索业务到实际项目中。"},{skill:"能搭建Jenkins+Docker用于项目的CI/CD做持续集成、部署，通过Docker镜像的方式实现自动化流程来检查代码并部署到新环境。"},{skill:"运用设计原则和设计模式对项目进行架构设计、封装服务调用中间层，提高代码重用性，加强代码解耦能力。"}]},{title:"工作经历",icon:"more",cardData:[{enterprise:"德生科技股份有限公司",department:"大数据项目组",position:"java开发工程师",contents:[{work:"1.负责公司一体化产品的后台开发、 pc端社保卡业务开发。"},{work:"2.编写一些公司通用服务，如短信服务、搭建一些分布式应用系统的环境。"},{work:"3.为公司多个展示大屏编写数据处理逻辑，提供接口给财务直接上传文件展示数据。"},{work:"4.优化公司现有系统的性能、实现高可用，在项目中对代码采用设计模式，对代码结构进行抽象，遵循软件设计原则，注重里氏替换原则，其核心为了调用的解耦。"},{work:"5.与开发经理，产品运营，前端，UI，测试人员共同参与需求分析，以及需求评审工作。"},{work:"6.负责从0到1搭建微服务架构项目（人力资源产品），参与项目搭建和各大应用组件，工具的封装。"}]},{enterprise:"奥格智能科技有限公司",department:"智慧水务二部",position:"java开发工程师",contents:[{work:"1.负责广州市排水设施巡检系统数据维护和更新迭代功能，合并其他城市或地区的排水巡检记录数据。"},{work:"2.编写、处理广州市各区的排水公司的排水设施巡检信息系统的数据，并统计报表信息。"},{work:"3.优化系统性能，提升用户交互体验，重构，优化项目代码结构。"},{work:"4.与产品经理，设计师，安卓APP开发工作人员协同工作，负责pc端，安卓手机APP端项目接口开发。"}]}]}],activeName:"1",images:["http://images.zhifa.tech/%E4%BA%91%E7%A4%BE%E8%81%983%E5%90%881.jpg","http://images.zhifa.tech/%E5%9F%8E%E5%B8%82%E5%88%86%E5%B8%83%E5%9B%BE.png","http://images.zhifa.tech/%E5%B9%BF%E5%B7%9E%E6%8E%92%E6%B0%B4%E5%B7%A1%E6%A3%80pc%281%29.png","http://images.zhifa.tech/%E6%B1%A1%E6%B3%A5%E5%B9%B2%E5%8C%96%E6%83%85%E5%86%B5.png","http://images.zhifa.tech/%E5%B9%B2%E5%8C%96%E6%B1%A1%E6%B3%A5%E7%84%9A%E7%83%A7%E5%A4%84%E7%BD%AE%E7%BB%9F%E8%AE%A1.png","http://images.zhifa.tech/%E5%B7%A1%E6%A3%80app5%E5%90%881.jpg","http://images.zhifa.tech/%E5%BE%AE%E4%BF%A1%E5%9B%BE%E7%89%87_20200904140205.png"]}}},L=z,D=(a("8cd7"),Object(s["a"])(L,A,S,!1,null,"47b10773",null)),P=D.exports,N=a("5c96"),R=a.n(N),F=(a("0fae"),function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"animeImg"},[a("div",{staticClass:"my_img"},[a("van-uploader",{staticClass:"upImg",attrs:{"image-fit":"cover",multiple:"","max-count":1,"after-read":e.afterRead,accept:"image/*"},model:{value:e.fileList,callback:function(t){e.fileList=t},expression:"fileList"}})],1),a("div",{staticClass:"my_img target"},[""!=e.targetImg?a("van-image",{attrs:{width:"10rem",height:"10rem",fit:"contain",src:e.targetImg},on:{click:e.viewTargetImg}}):e._e()],1)])}),M=[],U=(a("d3b7"),a("ac1f"),a("466d"),a("1276"),a("5cc6"),a("9a8c"),a("a975"),a("735e"),a("c1ac"),a("d139"),a("3a7b"),a("d5d6"),a("82f8"),a("e91f"),a("60bd"),a("5f96"),a("3280"),a("3fcc"),a("ca91"),a("25a1"),a("cd26"),a("3c5d"),a("2954"),a("649e"),a("219c"),a("170b"),a("b39a"),a("72f7"),a("6f45")),T=a.n(U),q={name:"AnimeImg",mounted:function(){window.document.title="动漫头像"},data:function(){return{fileList:[],targetImg:""}},methods:{dataURLtoFile:function(e){var t=e.split(","),a=t[0].match(/:(.*?);/)[1],i=atob(t[1]),n=i.length,r=new Uint8Array(n);while(n--)r[n]=i.charCodeAt(n);return new Blob([r],{type:a})},upLoaderImg:function(e,t){var a=this;return Object(O["a"])(regeneratorRuntime.mark((function i(){var n,r,s;return regeneratorRuntime.wrap((function(i){while(1)switch(i.prev=i.next){case 0:return n=new FormData,n.append("file",e),console.log(e),r={headers:{"Content-Type":"multipart/form-data"}},i.next=6,a.$http.post("/uploadImg",n,r);case 6:s=i.sent,a.targetImg=s.data,t.status="success";case 9:case"end":return i.stop()}}),i)})))()},rotateImg:function(e,t,a){var i=0,n=3;if(null!=e){var r=e.height,s=e.width,c=2;null==c&&(c=i),"right"==t?(c++,c>n&&(c=i)):(c--,c<i&&(c=n));var o=90*c*Math.PI/180,l=a.getContext("2d");switch(c){case 0:a.width=s,a.height=r,l.drawImage(e,0,0);break;case 1:a.width=r,a.height=s,l.rotate(o),l.drawImage(e,0,-r);break;case 2:a.width=s,a.height=r,l.rotate(o),l.drawImage(e,-s,-r);break;case 3:a.width=r,a.height=s,l.rotate(o),l.drawImage(e,-s,0);break}}},afterRead:function(e){var t,a=this;if(T.a.getData(e.file,(function(){t=T.a.getTag(this,"Orientation")})),e.status="uploading",e.message="客官请稍后...",console.log("file size ",e.file.size),/\/(?:jpeg|png|jpg|bmp)/i.test(e.file.type)&&e.file.size>1e6){var i=document.createElement("canvas"),n=i.getContext("2d"),r=new Image;r.src=e.content;var s=512;r.onload=function(){var c=s/(r.naturalWidth/r.naturalHeight);if(i.width=s,i.height=c,n.drawImage(r,0,0,i.width,i.height),e.content=i.toDataURL(e.file.type,.92),""!=t&&1!=t)switch(console.log("--------",t),t){case 6:a.rotateImg(r,"left",i);break;case 8:a.rotateImg(r,"right",i);break;case 3:a.rotateImg(r,"right",i),a.rotateImg(r,"right",i);break}var o=a.dataURLtoFile(e.content);a.upLoaderImg(o,e)}}else this.upLoaderImg(e.file,e)},viewTargetImg:function(){Object(d["a"])({images:[this.targetImg],closeable:!0})}}},$=q,J=(a("a979"),Object(s["a"])($,F,M,!1,null,"239dd77f",null)),W=J.exports,Q=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"main"},[a("keep-alive",[a("router-view")],1),a("van-tabbar",{attrs:{route:""}},[a("van-tabbar-item",{attrs:{replace:"",to:"/me",icon:"home-o"}},[e._v(" 个人信息 ")]),a("van-tabbar-item",{attrs:{replace:"",to:"/experience",icon:"apps-o"}},[e._v(" 项目介绍 ")])],1)],1)},G=[],H={name:"Main"},K=H,Z=Object(s["a"])(K,Q,G,!1,null,"4e89d9e0",null),V=Z.exports;i["default"].use(R.a),i["default"].use(m["a"]),i["default"].use(d["a"]),i["default"].use(p["a"]),i["default"].use(u["a"]),i["default"].use(g["a"]);var X=[{path:"/",name:"main",redirect:"/me",component:V,children:[{path:"/userInfo",name:"UserInfo",component:w,redirect:"/me"},{path:"/experience",name:"Experience",component:C},{path:"/me",name:"Me",component:P}]},{path:"/img",name:"AnimeImg",component:W}],Y=new p["a"]({routes:X}),ee=Y,te=a("2f62");i["default"].use(te["a"]);var ae=new te["a"].Store({state:{},mutations:{},actions:{},modules:{}}),ie=a("bc3a"),ne=a.n(ie);i["default"].prototype.$http=ne.a,ne.a.defaults.baseURL="http://47.100.45.101/",i["default"].config.productionTip=!1,new i["default"]({router:ee,store:ae,render:function(e){return e(l)}}).$mount("#app")},"5e6a":function(e,t,a){},"7c55":function(e,t,a){"use strict";var i=a("2395"),n=a.n(i);n.a},"8cd7":function(e,t,a){"use strict";var i=a("5e6a"),n=a.n(i);n.a},a36b:function(e,t,a){},a979:function(e,t,a){"use strict";var i=a("4e59"),n=a.n(i);n.a}});