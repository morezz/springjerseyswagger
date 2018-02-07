package com.groza.resource;

import com.groza.common.Result;
import com.groza.model.DemoEntity;
import com.groza.repository.DemoRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * HelloWorldResource
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */
@Component
@Path("/api")
@EnableAutoConfiguration
@Api(value = "hello", description = "hello api", tags = "hello")
public class HelloWorldResource {

    @Autowired
    private DemoRepository demoRepository;


    @ApiOperation(value = "获取用户信息", notes = "根据id获取用户信息")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "Not found")
    })
    @GET
    @Path("/hello/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public Result hello(@ApiParam(value = "用户标识", required = true) @PathParam(value = "id") Long id,
                        @ApiParam(value = "用户名称", required = false) @QueryParam("name") String name) {
        DemoEntity demoEntity = demoRepository.findOne(id);
        return new Result(0, "success", demoEntity);
    }


}
