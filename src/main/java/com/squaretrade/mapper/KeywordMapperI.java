package com.squaretrade.mapper;

import com.squaretrade.dto.KeyWordDto;
import com.squaretrade.entity.KeyWord;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface KeywordMapperI {
    KeywordMapperI INSTANCE = Mappers.getMapper(KeywordMapperI.class);

    KeyWordDto toKeyWordDto(KeyWord nace);

    KeyWord toKeyWord(KeyWordDto nace);

    List<KeyWordDto> toKeyWordDtoList(List<KeyWord> keyWordList);

    List<KeyWord> toKeyWordList(List<KeyWordDto> keyWordDtoList);

}
