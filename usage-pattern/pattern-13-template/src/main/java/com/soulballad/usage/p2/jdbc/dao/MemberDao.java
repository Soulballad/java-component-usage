package com.soulballad.usage.p2.jdbc.dao;

import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

import com.gupao.pattern.template.jdbc.JdbcTemplate;
import com.gupao.pattern.template.jdbc.Member;
import com.gupao.pattern.template.jdbc.RowMapper;

/**
 * @author Soulballad
 * @date 2019/3/22/0022 21:22
 * @email soda931vzr@163.com
 * @description
 */
public class MemberDao extends JdbcTemplate {

    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll() throws Exception {

        String sql = "select * from t_member";
        return super.executeQuery(sql, new RowMapper<Member>() {
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setNickname(rs.getString("nickname"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));

                return member;
            }
        }, null);
    }
}