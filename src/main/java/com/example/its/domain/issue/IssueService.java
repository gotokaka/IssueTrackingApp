package com.example.its.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IssueService {

  private final IssueRepository issueRepository;

  public List<IssueEntity> findAll() {
    return issueRepository.findAll();
  }

  // TODO トランザクション
  public void create(String summary, String description) {
    issueRepository.insert(summary, description);

    // 後処理が増えたとする（以下、トランザクション処理をされていないとデータの整合性取れないことを確かめるExceptionのスロー）
    throw new IllegalStateException("NG");
  }
}
