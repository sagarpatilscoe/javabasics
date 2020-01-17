package com.capgemini.com.SpringBootMvn;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @RequestMapping(value="/hello",method=RequestMethod.GET,produces="application/json")
    String hello() {
        return "Hello World!";
    }

    @Data
    static class Result {
      
		private final int left;
        private final int right;
        private final long answer;
    
        public Result(int left2, int right2, long long1) {
			// TODO Auto-generated constructor stub
        	this.left=left2;
        	this.right=right2;
        	this.answer=long1;
		}
    
    
    }

    // SQL sample
    @RequestMapping(value="calc", method = RequestMethod.GET)
    Result calc(@RequestParam int left, @RequestParam int right) {
        MapSqlParameterSource source = new MapSqlParameterSource()
                .addValue("left", left)
                .addValue("right", right);
        return jdbcTemplate.queryForObject("SELECT :left + :right AS answer", source,
                (rs, rowNum) -> new Result(left, right, rs.getLong("answer")));
    }
}
