package by.parakhnevich.likon.impl;

import by.parakhnevich.likon.PublicationService;
import by.parakhnevich.likon.exception.BadParameterException;
import by.parakhnevich.likon.mapper.PublicationModelMapper;
import by.parakhnevich.likon.model.PublicationClientModel;
import by.parakhnevich.likon.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PublicationServiceImpl implements PublicationService {
    private PublicationRepository publicationRepository;
    private PublicationModelMapper mapper;

    @Override
    public List<PublicationClientModel> readAllBetween(Map<String, String> parameters) {
        if (!parameters.containsKey("page")) {
            throw new BadParameterException("bad.param");
        }
        long from = (Long.parseLong(parameters.get("page")) - 1) * 5;
        long to = from + 5;
        return publicationRepository.findAllBetween(from, to)
                .stream()
                .map(a -> mapper.toClientModel(a))
                .collect(Collectors.toList());
    }

    @Override
    public long readCountOfPages() {
        long number = publicationRepository.findCountOfPublications();
        long result = 0;
        while (number > 0) {
            ++result;
            number-=5;
        }
        return result;
    }

    @Autowired
    public void setMapper(PublicationModelMapper mapper) {
        this.mapper = mapper;
    }

    @Autowired
    public void setPublicationRepository(PublicationRepository publicationRepository) {
        this.publicationRepository = publicationRepository;
    }
}
