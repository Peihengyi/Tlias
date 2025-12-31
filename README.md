# 📚 Tlias 项目学习笔记（黑马程序员）

> 🧑‍💻 一名 Java 初学者的学习之路 | 每日更新 | Spring Boot + MyBatis + MySQL

本项目是我在学习 [黑马程序员](https://www.itheima.com/) 的 **Tlias 企业级 Java Web 项目** 课程过程中，亲手编写并持续迭代的代码仓库。  
目标是：**从零搭建一个完整的部门-员工管理系统**，深入理解 Spring Boot、MyBatis、RESTful API、数据库设计等后端核心技能。

---

## 🌟 项目目标

- ✅ 掌握 Spring Boot 项目结构与自动配置
- ✅ 熟练使用 MyBatis 实现数据库 CRUD
- ✅ 编写规范的 RESTful 接口
- ✅ 理解分层架构（Controller / Service / Mapper）
- ✅ 学会统一异常处理、日志调试、单元测试
- ✅ 每日提交，记录成长轨迹 💪

---

## 🛠 技术栈

| 类别       | 技术                |
|------------|---------------------|
| 后端框架   | Spring Boot 3.x     |
| 持久层     | MyBatis             |
| 数据库     | MySQL 8.x           |
| 构建工具   | Maven               |
| 开发环境   | JDK 17 / IntelliJ IDEA |
| 测试       | JUnit 5, Mockito    |

---

## 📁 项目结构

tlias/
├── src/
│ ├── main/
│ │ ├── java/com/peihengyi/tlias/
│ │ │ ├── controller/ # 控制层（REST API）
│ │ │ ├── service/ # 业务逻辑层
│ │ │ ├── mapper/ # MyBatis 数据访问层
│ │ │ └── TliasApplication.java
│ │ └── resources/
│ │ ├── application.yml # 配置文件
│ │ └── mapper/ # MyBatis XML 映射文件（如有）
│ └── test/ # 单元测试
└── pom.xml # Maven 依赖管理


---

## 🚀 如何运行

1. **确保环境**：
   - JDK 17+
   - MySQL 8.x（创建数据库 `tlias`）
   - Maven

2. **配置数据库**：
   修改 `src/main/resources/application.yml` 中的 `spring.datasource` 配置：
   ```yaml
   spring:
     datasource:
       url: jdbc:mysql://localhost:3306/tlias?useSSL=false&serverTimezone=Asia/Shanghai
       username: your_username
       password: your_password
