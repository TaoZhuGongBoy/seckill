package com.cgx.marketing.application.activity;
/**
 * 应用层<br/>
 * 职责定位:它主要存放应用层服务组合和编排相关的代码。
 * 应用服务向下基于微服务内的领域服务或外部微服务的应用服务完成服务的编排和组合，向上为用户接口层提供各种应用数据展现支持服务。应用服务和事件等代码会放在这一层目录里。<br>
 * 以下是对各个package的说明:
 *   facade: 提供较粗粒度的调用接口，将用户请求委派给一个或多个应用服务进行处理。
 *   assembler:实现 DTO 与领域对象之间的相互转换和数据交换。一般来说 Assembler 与 DTO 总是一同出现
 *   service:这层的服务是应用服务。应用服务会对多个领域服务或外部应用服务进行封装、编排和组合，对外提供粗粒度的服务。
 *   应用服务主要实现服务组合和编排，是一段独立的业务逻辑。你可以将所有应用服务放在一个应用服务类里，也可以把一个应用服务设计为一个应用服务类，以防应用服务类代码量过大
 *
 */