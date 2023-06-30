package com.example.its.web.issue;

import com.example.its.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {

  private final IssueService issueService;

  @GetMapping
  public String showList(Model model) {
    model.addAttribute("issueList", issueService.findAll());
    return "issues/list";
  }

  //GET /issues/creationForm
  @GetMapping("/creationForm")
  public String showCreationForm(Model model) {
    model.addAttribute("issueForm", new IssueForm()); //直接インスタンスを書くというやり方もある
    return "issues/creationForm";
  }

  // POST /issues
  @PostMapping
  public String create(IssueForm form, Model model) {
    // TODO データの永続化
    return showList(model); // TODO リロードボタン対策が必要
  }
}
