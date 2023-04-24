package com.digital.fund.chitty.controller;

import com.digital.fund.chitty.dto.MemberDto;
import com.digital.fund.chitty.entity.Member;
import com.digital.fund.chitty.service.MemberService;
import com.digital.fund.chitty.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Slf4j
@RestController
@RequestMapping(value="/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public ResponseEntity<List<Member>> getAllMember(){
        return ResponseEntity.ok(memberService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<MemberDto> getMemberById(@PathVariable long id){
        MemberDto memberDto = memberService.finById(id).orElseThrow(RuntimeException::new);
        return ResponseEntity.ok(memberDto);
    }

    @PostMapping
    public ResponseEntity<MemberDto> save(@RequestBody MemberDto memberDto){
        return ResponseEntity.ok(memberService.save(memberDto));
    }
    @PutMapping
    public ResponseEntity<MemberDto> update(@RequestBody MemberDto memberDto){
        return ResponseEntity.ok(memberService.update(memberDto));

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable long id) {
        memberService.delete(id);
        return ResponseEntity.ok(true);
    }


}
