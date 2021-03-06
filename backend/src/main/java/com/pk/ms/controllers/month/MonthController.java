package com.pk.ms.controllers.month;

import com.pk.ms.dto.month.MonthInputDTO;
import com.pk.ms.dto.month.MonthWithBasicDayDTO;
import com.pk.ms.entities.month.Month;
import com.pk.ms.services.month.MonthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MonthController {

    private final MonthService monthService;

    public MonthController(MonthService monthService) {
        this.monthService = monthService;
    }

    // create a Month
    @PostMapping(value = "/years/{year_id}/months",consumes = "application/json")
    public ResponseEntity<Month> createMonth(@PathVariable("year_id") long yearId, @RequestBody MonthInputDTO monthInputDTO) {
        return ResponseEntity.ok(monthService.createMonth(yearId, monthInputDTO));
    }

    // ONE OF THE FINAL ENDPOINTS!!!
    // get particular Month with its plans and list of DayBasicInfoDTO
    @GetMapping("/months/{month_id}")
    public ResponseEntity<MonthWithBasicDayDTO> getMonth(@PathVariable("month_id") long monthId) {
        return ResponseEntity.ok(monthService.getMonth(monthId));
    }

    // delete Month
    @DeleteMapping("/months/{month_id}")
    public ResponseEntity<String> deleteMonth(@PathVariable("month_id") long monthId) {
        monthService.delete(monthId);
        return ResponseEntity.ok("Month successfully deleted. ");
    }

}
