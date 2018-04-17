# ua-matcher
整理项目中使用的浏览器信息识别组件，通过获取user-agent字符串匹配正则解析浏览器属性信息:
```
- client(浏览器)
- version(浏览器版本)
- engine(引擎)
- os(操作系统)
- osVersion(操作系统版本)
- device(设备)
```


例如:
```
user-agent="Mozilla/5.0 (Windows Phone 10.0; Android 6.0.1; Microsoft; Lumia 950) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Mobile Safari/537.36 Edge/15.15063"
```
则解析的结果为：
```
{client=Edge,version=52.0.2743.116,engine=WebKit,os=Windows Phone,osVersion=6.0.1,device=Mobile}
```
# TODO
目前正则库[matchers.json](https://github.com/jaafaree/ua-matcher/blob/master/src/main/resources/uamatchers.json)可匹配市面大部分浏览器厂商，后续慢慢更新...

