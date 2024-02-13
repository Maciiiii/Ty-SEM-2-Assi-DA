import nltk
from nltk.sentiment.vader import SentimentIntensityAnalyzer
vd=SentimentIntensityAnalyzer()
te=" I purchased Mango online. I am very happy with product "#positive
print("\n",vd.polarity_scores(te))
te=" I hate tea  "#-ve
print("\n",vd.polarity_scores(te))
te=" I saw movie yesterday. The animation was really good but script was ok "#neutral--mix
print("\n",vd.polarity_scores(te))
te=" I enjoy listning music "#positive
print("\n",vd.polarity_scores(te))
