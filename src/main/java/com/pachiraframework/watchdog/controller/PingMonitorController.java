package com.pachiraframework.watchdog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.pachiraframework.common.ExecuteResult;
import com.pachiraframework.watchdog.dto.NewPingMonitor;
import com.pachiraframework.watchdog.entity.PingMonitor;
import com.pachiraframework.watchdog.service.PingMonitorService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author wangxuzheng
 *
 */
@Api(value="ping监控器Controller",tags= {"ping"})
@RestController
@RequestMapping("/api/monitor/ping")
public class PingMonitorController {
	@Autowired
	private PingMonitorService pingMonitorService;
	@ApiOperation(value = "创建新的ping监控器", notes = "创建一个新的ping监控记录", httpMethod = "POST", produces = MediaType.APPLICATION_JSON_VALUE)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "创建成功后的ping监控器信息") })
	@RequestMapping(path = "/create", method = { RequestMethod.POST })
	public ResponseEntity<ExecuteResult<PingMonitor>> add(@RequestBody NewPingMonitor pingMonitor) {
		ExecuteResult<PingMonitor> result = pingMonitorService.create(pingMonitor);
		return ResponseEntity.ok(result);
	}
	
	@ApiOperation(value="根据ID查看监控器明细", httpMethod="GET", produces = MediaType.APPLICATION_JSON_VALUE)
	@RequestMapping(path="/{id}", method = { RequestMethod.GET })
	public ResponseEntity<ExecuteResult<PingMonitor>> get(@ApiParam(name="id",value="ping监控器id",required=true) @PathVariable(name="id")Long id) {
		ExecuteResult<PingMonitor> result = pingMonitorService.get(id);
		return ResponseEntity.ok(result);
	} 
} 
