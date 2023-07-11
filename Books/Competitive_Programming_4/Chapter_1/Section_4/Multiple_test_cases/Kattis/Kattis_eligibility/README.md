# Problem eligibility - Eligibility

Every year, students across the world participate in the ACM ICPC. In order to participate in this contest, a student must be eligible to compete. In this problem, you will be given information about students and you will write a program to determine their eligibility to participate in the ICPC.

We will start by assuming that each student meets the “Basic Requirements” as specified in the ICPC rules—the student is willing to compete at the World Finals, is a registered student with at least half-time load, competes for only one institution in a contest year, and has not competed in two world finals or five regional contests.

The rules to decide if a student is eligible to compete in the contest year 2014–2015 are as follows:

1. if the student first began post-secondary studies in 2010 or later, the student is eligible;

2. if the student is born in 1991 or later, the student is elegible

3. if none of the above applies, and the student has completed more than an equivalent of 8 sesmesters of full-time study, the student is inelegible

4. if none of the above applies, the coach may petition for an extension of eligibility by providing the student’s academic and work history.

For “equivalent of 8 semesters of full-time study,” we consider each semester of full-time study to be equivalent to a student completing 5 courses. Thus, a student who has completed 41 courses or more is considered to have more than 8 semesters of full-time study.

## Input

The input consists of a number of cases. The first line contains a positive integer, indicating the number of cases to follow. Each of the cases is specified in one line in the following format

```text
name YYYY/MM/DD YYYY/MM/DD courses
```

where name is the name of the student (up to 30 alphabetic characters), the first date given is the date the student first began post-secondary studies, and the second date given is the student’s date of birth. All dates are given in the format above with 4-digit year and 2-digit month and day. courses is a non-negative integer indicating the number of courses that the student has completed.

There are at most $1000$ cases.

## Output

For each line of output, print the student's name, followed by a space, followed by one of the strings `elegible`, `inelegible`, and `coach petitions` as appropriate

## Sample Input

```text
3
EligibleContestant 2013/09/01 1995/03/12 10
IneligibleContestant 2009/09/01 1990/12/12 50
PetitionContestant 2009/09/01 1990/12/12 35
```

## Sample Output

```text
EligibleContestant eligible
IneligibleContestant ineligible
PetitionContestant coach petitions
```
