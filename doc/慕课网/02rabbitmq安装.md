#1、mac下rabbitmq的安装
    1、brew install rabbitmq
        安装过程中会自动安装所依赖的 Erlang 。
        MQ的安装目录在 /usr/local/Cellar/rabbitmq
        
    2、安装RabiitMQ的可视化监控插件
           // 切换到MQ目录,注意你的安装版本可能不是3.7.14
           cd /usr/local/Cellar/rabbitmq/3.7.14/sbin
           // 启用rabbitmq management插件,才会有web页面。
           sudo sbin/rabbitmq-plugins enable rabbitmq_management
           
    3、配置环境变量
        sudo vi /etc/profile
       //加入以下两行
       export RABBIT_HOME=/usr/local/Cellar/rabbitmq/3.7.14
       export PATH=$PATH:$RABBIT_HOME/sbin
       // 立即生效
       source /etc/profile
       
    4、后台启动rabbitMQ
          // 后台启动
          rabbitmq-server -detached  
          // 查看状态
          rabbitmqctl status 
          // 访问可视化监控插件的界面
          // 浏览器输入 http://localhost:15672,默认的用户名密码都是guest,登录后可以在Admin那一列菜单内添加自己的用户
          rabbitmqctl stop 关闭