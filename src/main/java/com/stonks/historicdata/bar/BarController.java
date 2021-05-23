package com.stonks.historicdata.bar;

import java.util.List;
import javax.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@RepositoryRestController
@RequiredArgsConstructor
@Transactional
public class BarController {

  private final BarRepository repository;

  @PostMapping("/bars/list")
  public @ResponseBody ResponseEntity<CollectionModel<Bar>> createBars(
      @RequestBody List<Bar> bars) {
    val persistedBars = repository.saveAll(bars);

    CollectionModel<Bar> resources = CollectionModel.of(persistedBars);

    return ResponseEntity.ok(resources);
  }
}
