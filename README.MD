## SpringCloud Demo

* cloud-config-repo : 配置文件仓库
* cloud-config-server : 配置服务端

#### application.yml
> server:
> >  port: 8888
> info:
> >  component: Config Server
> spring:
> >  application:
> > >    name: configserver
> >  profiles:
> > >    active: developement
> >  cloud:
> > >    config:
> > > >      server:
> > > > >        git:
> > > > >          uri: https://github.com/kalasZs/SpringCloud.git
> > > > >          searchPaths: cloud-config-repo


* cloud-simple-clinet : 客户端使用案例
#### bootstrap.yml
> spring:
> >  application:
> > >    name: config
> >  profiles:
> > >    active: dev
> >  cloud:
> > >    config:
> > > >      env: defalut
> > > >      label: master
> > > >      uri: http://localhost:${config.port:8888}

> server:
> >  port: 8081