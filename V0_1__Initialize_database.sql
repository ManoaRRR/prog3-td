create database prog3_td2;
\c prog3_td2;

create table team(
    id_team  serial primary key,
    team_name varchar
);
create table player(
    id_player serial primary key,
    player_name varchar,
    numbers int,
    id_team int references team (id_team)
);
create table sponsor(
    id_sponsor  serial primary key,
    name_sponsor varchar
);
create table have(
    id_team int references team (id_team),
    id_sponsor int references sponsor (id_sponsor) 
);