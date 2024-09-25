package com.app.yanawa.domain.matching;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter @ToString @EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
@AllArgsConstructor
public class MatchingVO {
    @EqualsAndHashCode.Include
    private Long postId;
    private String matchStatus;
    private Long teamId;
    private int sportKindValue;
    private String timeRegister;
    private String dateRegister;
    private int timeCordinate;
    private int dateCordinate;
    private String city;
    private String localCity;
    private String localCityDetail;
    private String createDate;
    private String updateDate;

    public MatchingDTO toDTO() {
        MatchingDTO matchingDTO = new MatchingDTO();
        matchingDTO.setPostId(postId);
        matchingDTO.setMatchStatus(matchStatus);
        matchingDTO.setTeamId(teamId);
        matchingDTO.setSportKindValue(sportKindValue);
        matchingDTO.setTimeRegister(timeRegister);
        matchingDTO.setDateRegister(dateRegister);
        matchingDTO.setTimeCordinate(timeCordinate);
        matchingDTO.setDateCordinate(dateCordinate);
        matchingDTO.setLocalCityDetail(localCityDetail);
        matchingDTO.setCreateDate(createDate);
        matchingDTO.setUpdateDate(updateDate);
        return matchingDTO;
    }
}
