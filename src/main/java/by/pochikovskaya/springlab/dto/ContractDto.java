package by.pochikovskaya.springlab.dto;


import by.pochikovskaya.springlab.model.Contract;
import by.pochikovskaya.springlab.dto.validators.DateConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ContractDto {
    @Min(value = 0L, message = "Идентификатор не может быть отрицательным")
    private Long id;
    private boolean isActive;
    @DateConstraint(message = "Некорректная дата")
    private Date startDate;
    @DateConstraint(message = "Некорректная дата")
    private Date endDate;
    @Min(value = 0L, message = "Идентификатор не может быть отрицательным")
    private Long userId;
    @NotBlank(message = "Введите username")
    @Size(min=2, max=255,message = "Username должен содержать от 5 до 255 символов")
    private String username;
    @NotNull
    @Min(value = 0L, message = "Идентификатор не может быть отрицательным")
    private Long computerId;

    public static ContractDto fromContract(Contract contract){
        ContractDto contractDto = new ContractDto();

        contractDto.id = contract.getId();
        contractDto.isActive = contract.isActive();
        contractDto.startDate = contract.getStartDate();
        contractDto.endDate = contract.getEndDate();
        return contractDto;
    }
}
