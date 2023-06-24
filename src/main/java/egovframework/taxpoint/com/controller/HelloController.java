package egovframework.taxpoint.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.com.cmm.service.ResultVO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@Tag(name = "HelloController", description = "Hello 출력")
public class HelloController {

	/**
     * 첨부파일에 대한 삭제를 처리한다.
     *
     * @param 
     * @return resultVO
     * @throws Exception
     */
    @Operation(
			summary = "Hello 출력",
			description = "Hello를 ResultVO를 통해 출력",
			tags = {"HelloController"}
	)
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "성공")
	})
	@GetMapping("/hello")
	public ResultVO SendHello() {
		ResultVO resultVO = new ResultVO();
		resultVO.setResultMessage("Hello");
		resultVO.setResultCode(200);
		return resultVO;
	}
}
