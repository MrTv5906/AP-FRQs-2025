public ArrayList<Match> buildMatches(){
  Arraylist<Match> matches = new Arraylist<Match>();
  if(competitorList.size() % 2 == 0){
    for(int i = 0; i < competitorList.size(); i++){
      matches.add(new Match(competitorList.get(i)), competitorList.get(competitorList.size()-i-1));
    }
  } else {
    for(int i = 1; i < competitorList.size(); i++){
      matches.add(new Match(competitorList.get(i)), competitorList.get(competitorList.size()-i));
  }
}
  return matches;
}

